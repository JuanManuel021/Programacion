public class EmpleadoPorHora extends Empleado {
 double horasTarbajadas;
 double pagoPorHora;

 public EmpleadoPorHora (int id,String nombre, double horasTarbajadas, double pagoPorHora){
   super(id,nombre);
    this.horasTarbajadas=horasTarbajadas;
    this.pagoPorHora=pagoPorHora;

}


public double getHorasTarbajadas() {
    return horasTarbajadas;
}
public double getPagoPorHora() {
    return pagoPorHora;
}
public void setHorasTarbajadas(double horasTarbajadas) {
    this.horasTarbajadas = horasTarbajadas;
}
public void setPagoPorHora(double pagoPorHora) {
    this.pagoPorHora = pagoPorHora;
}


@Override
public double calcularSueldo() {
    return horasTarbajadas*pagoPorHora;
}

 

}
