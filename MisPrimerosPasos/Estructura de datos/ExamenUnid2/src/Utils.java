import java.util.Random;


public class Utils {

    

    public int[][] getNumber() {
        int[][] arrBi = new int[3][5]; 
        Random random = new Random(); 
    
        for (int i = 0; i < arrBi.length; i++) {
            for (int j = 0; j < arrBi[i].length; j++) {
                arrBi[i][j] = random.nextInt(10) + 1; 
            }
        }
    
        return arrBi; 
    }
    

    }


