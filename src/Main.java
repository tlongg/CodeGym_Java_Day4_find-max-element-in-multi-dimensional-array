import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rowSize;
        int columnSize;
        int[][] array;

        do {
            System.out.println("Enter a row size:");
            rowSize = scanner.nextInt();

            System.out.println("Enter a column size:");
            columnSize = scanner.nextInt();

            if (rowSize > 20 || columnSize >20) {
                System.out.println("Size does not exceed 20");
            }
        } while (rowSize > 20 || columnSize > 20);

        array = new int[rowSize][columnSize];

        System.out.println("Enter matrix value:");
        for (int i = 0; i < rowSize; i++){
            for (int j = 0; j < columnSize; j ++){
                array[i][j] = scanner.nextInt();
            }
        }

        int maxElement = array[0][0];
        int maxRox = 0;
        int maxColumn = 0;

        for (int i = 0; i < rowSize; i++){
            for (int j = 0; j < columnSize; j ++){
                if (array[i][j] > maxElement){
                    maxElement = array[i][j];
                    maxRox = i;
                    maxColumn = j;
                }
            }
        }

        System.out.println("Max element in the array is " + maxElement);
        System.out.println("Max element in row is " + maxRox + " and max element in column is " + maxColumn);

    }
}
