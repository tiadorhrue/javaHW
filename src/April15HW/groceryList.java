package April15HW;

public class groceryList {
    public static void main(String[] args) {

        String[][] glist = {
                {"Lettuce", "Apples"},
                {"Chocolate", "Yogurt"}
        };
        for (int row = 0; row < glist.length; row++) {
            for (int column = 0; column < glist.length; column++) {
                System.out.print(glist[row][column] + " ");

            }

        }
        System.out.println();
        for (String[] rows : glist) {
            for (int columns = 0; columns < glist.length; columns++) {
                System.out.print(rows[columns] + " ");


            }
        }
    }
}
