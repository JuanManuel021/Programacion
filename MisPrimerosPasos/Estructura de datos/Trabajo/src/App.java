public class App {
    public static void main(String[] args) throws Exception {
       
        
        EmpleadoBase e = new EmpleadoBase(1,"JUAN",100, 0.50);
        System.out.println(e.id);
        System.out.println(e.nombre);
        System.out.println(e.calcularSueldo());
        System.out.println(e.calcularBono());

        EmpleadoPorHora eh=new EmpleadoPorHora(2,"Sinue",15,200);
        System.out.println(eh.id);
        System.out.println(eh.nombre);
        System.out.println(eh.calcularSueldo());
       
    }
}
