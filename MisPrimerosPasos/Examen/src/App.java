public class App {
    public static void main(String[] args) throws Exception {
    int n=5;
    int x=1;
           
    System.out.println("Decresiente: ");
    desendiente(n);  
           
    System.out.println("Cresiente: ");
    asendente(n, x);
    }
    
    public static int desendiente(int n) {
    if (n == 0) {
    return 1; 
    }
    System.out.println(n); 
    return desendiente(n - 1); 
    }

    public static int asendente(int n, int x) {
    if (x > n) {
    return 1; 
    }
    System.out.println(x); 
    return asendente(n, x + 1); 
    }
}
