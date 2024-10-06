public class Potencia {
    int x;//variables a ocupar
    int n;//variables a ocupar

    public Potencia() {//creacion de objeto vacio
    }

    public Potencia(int x, int n) {//creacion de objeto con los parametos
        this.x = x;//especificamos que las variables se encuentran desde de la clase
        this.n = n;//especificamos que las variables se encuentran desde de la clase
    }

    public int potenciador(int x, int n) {//delcaramos la funcion con los datos necesarios
        if (n != 0) {//condicional para que sea diferente de 0
            return x * potenciador(x, n - 1);//regresamos la multilicación y restandole sucesivamente n-1 
        } else {//en caso de que n sea 0 
            return 1;//regresa uno y volvemos al if inicial y empezamos a calcular el exponencial
        }
    }

    public int potenciadorInter(int x, int n) {//delcaramos la funcion con los datos necesarios
        int resultado = 1;//declaramos resultado para que en caso de que n sea cero regrese 1
        for (int i = 0; i < n; i++) {//en el for vamos haciendo el recorido de la cantidad de n
            resultado = resultado * x;//sumamos el resultado anterior con la multiplicación de este con el valor x
        }
        return resultado;//regrersamos el resultado
    }
}












    


