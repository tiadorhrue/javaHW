package April15HW;

public class evenNumbersOnly {

    public static void main(String[] args) {

        int [][] matrix={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int columns = 0; columns <= matrix.length; columns++) {
                if(matrix[rows][columns]%2==0)
                {
                    System.out.println(matrix[rows][columns]);
                }

            }

        }
    }
}
