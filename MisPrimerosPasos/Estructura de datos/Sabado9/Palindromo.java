public class Palindromo {
    public static void main(String[] args) {
        String palabra = "reconocerl";
        Queue<Character> queue = new Queue<>(palabra.length());
        Stack<Character> stack = new Stack<>(palabra.length());
        
        System.out.println("\n"+palabra.length());
        for (int i = 0; i < palabra.length(); i++) {
            queue.offer(palabra.charAt(i));
            stack.push(palabra.charAt(i));
        }

        boolean flag = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (queue.peek() != stack.peek()) {
                flag = true;
            }
            queue.poll();
            stack.pop();
        }

        System.out.print("La palabra '"+palabra+"'");
        if (flag) {
            System.out.print(" No es un palindromo");
        }else{
            System.out.print(" Si es un palindromo");
        }
    }
}