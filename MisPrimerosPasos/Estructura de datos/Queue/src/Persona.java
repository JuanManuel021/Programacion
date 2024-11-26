public class Persona {
    String nombre;
    int numeroSeguro;
    int edad;
    public Persona(String nombre, int numeroSeguro, int edad) {
        this.nombre = nombre;
        this.numeroSeguro = numeroSeguro;
        this.edad = edad;
    }
    @Override
public String toString() {
    return "Nombre: " + nombre + ", Número de Seguro: " + numeroSeguro + ", Edad: " + edad;
}
    public Persona() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumeroSeguro() {
        return numeroSeguro;
    }
    public void setNumeroSeguro(int numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
