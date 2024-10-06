public class Arreglos {
    public static void main(String[] args) throws Exception {
     //Los arreglos se declaran:
     int [] datos;
     //Se inicializan:
     datos=new int[10];

     //Tambien se puede todo en una misma instruccion 
     int[] arreglo=new int [5];

     // o directamente con los valores
     int[]arregloDos ={12,5,8,9};

     // aqui new int[arregloDos.length] pone de una forma dinamica el tamaño de arregloDos en el nuevo arreglo  
     int[] sumaArreglos=new int[arregloDos.length];

     //Para mostrar 
     for (int i=0; i<arregloDos.length ;i++){
        System.out.println(arregloDos[i]);
        //para guardar en otro arreglo con una suma por ejemplo
        sumaArreglos[i]=arregloDos[i]+ arregloDos[i];
        System.out.print("La suma es: ");
        System.out.println(sumaArreglos[i]);


        //Para eliminar un elemento ---------------------------------------------------------------------------------
        int[] arregloSinEliminar={12,3,5,9,15};
        int[] arregloEliminado=new int [arregloSinEliminar.length-1];
        //Declaramos en una variable el indicie que queremos elimina 
        int j=3;
        for (int x=0,k=0;x<arregloSinEliminar.length;x++){
            if(x!=j){
                arregloEliminado[k]=arregloSinEliminar[x];
                k++;
            }
        } 
        System.out.println("---------------------------------------Arreglo eliminando un valor---------------------");
        for (int c=0;c<arregloEliminado.length;c++){
            
            System.out.println(arregloEliminado[c]);
        }//----------------------------------------------------------------------------------------------
        //Para agregar un arreglo
        int[] arregloSinAgregar={1,2,3,4,5,6,7,8,9};
        int[] arregloAgregado=new int[arregloSinAgregar.length+1];

        for(i=0;i<arregloSinAgregar.length;i++){
            arregloAgregado[i]=arregloSinAgregar[i];
        }
        arregloAgregado[arregloAgregado.length-1]=10;
        System.out.println("-----------Arreglo agregando un valor mas------------------------------------------");
        for(i=0;i<arregloAgregado.length;i++){
            System.out.println(arregloAgregado[i]);
        }


        
        
     }

    }
}

