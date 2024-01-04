public class CalSumOf2DArr {
    public static void main(String[] args) {
        int [][] mat1 = {{2,4,6},
                         {1,3,5}};
        int [][] mat2 = {{8,10,1},
                         {7,9,14}};
        int [][] result = {{0,0,0},
                           {0,0,0}};

        for(int i=0; i<mat1.length; i++){
            for(int j=0; j<mat1[i].length; j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
            System.out.println(" ");
        }
    }
}
