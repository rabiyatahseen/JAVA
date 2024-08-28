public class ThreeDArray {
    public static void main(String[] args) {
        int [][][] arr = new int [2][2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
            	for (int k = 0; k < 2; k++) {
              		System.out.print(arr[i][j][k]);
              		System.out.print(" ");
            	}
            	System.out.println();
            }
            System.out.println();
        }
 
    }
}

OUTPUT:
0 0 
0 0 

0 0 
0 0 

