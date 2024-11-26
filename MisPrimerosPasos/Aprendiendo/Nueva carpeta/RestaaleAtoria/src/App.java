import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int variable=150;
        Random random=new Random();
        int numeroRestado=random.nextInt(10);
        for (int i = 0; i <= 20; i++) {
            variable=variable-numeroRestado;
        }
        System.out.println(variable);
    }
}
