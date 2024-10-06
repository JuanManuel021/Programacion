

public class EmpleadoBase extends Empleado implements Bonificable{
    double sueldoBase;
    double porcentajeBono;

    public EmpleadoBase (){
    }
    public EmpleadoBase (int id,String nombre, double sueldoBase, double porcentajeBono){
        super( id, nombre);
      
        this.sueldoBase=sueldoBase;
        this.porcentajeBono=porcentajeBono;

    }
    public double getSueldoBase() {
        return sueldoBase;
    }
    public double getPorcentajeBono() {
        return porcentajeBono;
    }
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    public void setPorcentajeBono(double porcentajeBono) {
        this.porcentajeBono = porcentajeBono;
    }
    @Override
    public double calcularBono() {
        
       return sueldoBase*porcentajeBono;
    }
    @Override
    public double calcularSueldo() {
        return sueldoBase+calcularBono();  
    }
}
