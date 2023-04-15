package April15HW;

public class foreignCars {

    public static void main(String[] args) {

        String[][] arry = {
                {"American", "Korean"},
                {"Italian", "German"}
        };

        for (int row = 0; row < arry.length; row++) {
            for (int column = 0; column < arry.length; column++) {
                System.out.print(arry[row][column] + " ");

            }

        }
        System.out.println();

        for (String[] cars : arry) {
            for (int columns = 0; columns < arry.length; columns++) {
                System.out.print(cars[columns] + " ");

            }
        }
    }
}
