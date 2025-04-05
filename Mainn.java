import java.util.*;

public class Mainn {
    private int[][] a;
    private Scanner ss;


    public Mainn(int rows, int cols) {
        a = new int[rows][cols];
        ss = new Scanner(System.in);
    }

    
    public void set(int row, int col, int data) {
        if (row >= 0 && row < a.length && col >= 0 && col < a[0].length) {
            a[row][col] = data;
        } else {
            System.out.println("Invalid index");
        }
    }

    
    public int get(int row, int col) {
        if (row >= 0 && row < a.length && col >= 0 && col < a[0].length) {
            return a[row][col];
        } else {
            System.out.println("Invalid index");
            return -1;  
        }
    }

    
    public void print() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    public void inputValues() {
        System.out.println("Enter values for the 2D array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Enter value for element at (" + i + "," + j + "): ");
                int value = ss.nextInt();
                set(i, j, value);
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();


        Mainn arr = new Mainn(rows, cols);


        arr.inputValues();

        System.out.println("The 2D array you entered is:");
        arr.print();

       
        System.out.print("Enter row index for getting an element: ");
        int rowIndex = sc.nextInt();
        System.out.print("Enter column index for getting an element: ");
        int colIndex = sc.nextInt();
        System.out.println("Element at (" + rowIndex + "," + colIndex + "): " + arr.get(rowIndex-1, colIndex-1));
    sc.close();
    }

}
