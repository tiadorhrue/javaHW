package April15HW;

public class threeRowsThreeColumns {
    public static void main(String[] args) {
        int [][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sum=0;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length ; column++) {
                sum=sum+matrix[row][column];

            }
        }
        System.out.println(sum);
    }
}
