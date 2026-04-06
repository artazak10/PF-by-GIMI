public class Lecture {

    public static void main(String[] args) {                                 // sets a={a,b,c}
                                                                             // a= { {1,2,3}}

        int[][] arr = {   {1, 2, 3},  {4, 5, 6} };                   /*addition of matrix a and matrix b and gain a output of additive matrix c */

        int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        addMatrix(arr, arr2);
    }
                                                                               /*    public static void sqare(a) 
                                                                                     a=read.next double 
                                                                                     b= a*a;
                                                                                     return(b)
                                                                                    
                                                                                    
                                                                                    
                                                                                    
                                                                                    arr1[0][1] = 2   

                                                                                  0:  1 2 3 
                                                                               ,, 1:  4 5 6
                                                                                   
                                                                                    
                                                                                    */
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addMatrix(int[][] arr1, int[][] arr2) {

        int[][] result = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {  
                 result [i][j]= arr1 [i][j] + arr2 [i][j] ;
                
            }}
        printArray(result);

        }}