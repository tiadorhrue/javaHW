package April15HW;

public class countries {

    public static void main(String[] args) {

        String [][] matrix={
                {"United Stated","Canada","Mexico"},
                {"Brazil","Chile","Argentina"},
                {"Madagascar","Congo","Nigeria"},
                {"Italy","France","Greece"},
                {"North Korea","Japan","China"}
        };

        int sum=1;
        for (int row = 0; row < matrix.length ; row++) {
            for (int columns = 0; columns < matrix[row].length  ; columns++) {
                System.out.print(matrix[row][columns]+" ");
                sum=matrix.length*matrix[row].length;
            }

            }

            System.out.println();
        System.out.println(sum);


        }


    }

