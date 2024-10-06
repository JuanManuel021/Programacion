public abstract class Empleado {
    int id;
    String nombre;


    public Empleado (){

    }

    public Empleado (int id,String nombre){
        this.id=id;
        this.nombre=nombre;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract  double calcularSueldo();

    public String describir(){
        return "El id es: "+id+" El empleado es: "+nombre;
    

}
}
