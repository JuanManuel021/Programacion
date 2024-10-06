import java.util.Random;
public class Persona {
    private String name;//creo la variables privadas
    private int edad;//creo la variables privadas

    public Persona(String name, int edad){//creo el constructor con las variables
        this.name=name;//declaro las variables de la clase 
        this.edad=edad;//declaro las variables de la clase 
    }

    public String getName() {//geter de name
        return name;
    }
    public int getEdad() {//geter de edad
        return edad;
    }
    public void setName(String name) {//seter de nombre 
        this.name = name;
    }
    public void setEdad(int edad) {//seter de edad
        this.edad = edad;
    }
    
    public int numeroRamdom(){//metodo declarado
        Random random=new Random();//genero un numero aleatorio
        int x=random.nextInt(100)+1;//guardo en numero aleatorio en x 
        return x;//regreso el numero aleatorio 
       
    }
}

