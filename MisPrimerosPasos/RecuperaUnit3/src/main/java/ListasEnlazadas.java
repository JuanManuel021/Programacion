public class ListasEnlazadas {
    Nodo cabeza;

    ListasEnlazadas() {
        this.cabeza = null;
    }

    public void ponerNodo(Integer valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temporal = cabeza;
            while (temporal.getSiguiente() != null) {
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevoNodo);
        }
    }

    public int buscar(int valorBuscar) {
        int valor = -1;
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
        } else if (cabeza != null) {
            Nodo temporal = cabeza;
            boolean encontrado = false;
            while (temporal != null) {
                if (temporal.getValor() == valorBuscar) {
                    valor = temporal.getValor();
                    encontrado = true;
                    break;
                }
                temporal = temporal.getSiguiente();
            }
            //System.out.println("Valor final " + temporal.getValor());
          //  if (!encontrado) {
           //     System.out.println("-1");
            //}

        }

        return valor;
    }
}
