public class Fibo {
int n;

public Fibo(){

}
public Fibo(int n){
    this.n=n;
}

public int fibonacci(int n) {
    if (n == 0) {
        return n;
    }
    if (n == 1) {
        return n;
    }
        
    return fibonacci(n - 1) + fibonacci(n - 2);

}
}
