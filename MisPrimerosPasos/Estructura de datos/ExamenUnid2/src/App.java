public class App {
    public static void main(String[] args) throws Exception {

        Utils objeto = new Utils();
        int[][] arrBi = objeto.getNumber();

        for (int x = 0; x < arrBi.length; x++) {
            System.out.println("");
            for (int y = 0; y < arrBi[x].length; y++) {
                System.out.print(arrBi[x][y]);
            }
        }

        int e = 2;

        for (int i = 0; i < arrBi[e].length; i++) {
            for (int j = 1; j < arrBi[e].length; j++) {
                if (arrBi[e][j] < arrBi[e][j - 1]) {

                    int tempotal = arrBi[e][j];
                    arrBi[e][j] = arrBi[e][j - 1];
                    arrBi[e][j - 1] = tempotal;
                }
            }
        }

        System.out.println();

        System.out.println(" ");
        int x = 2;
        for (int y = 0; y < arrBi[x].length; y++) {
            System.out.print(arrBi[x][y]);
        }

    }

}
