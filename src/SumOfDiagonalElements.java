import java.util.Scanner;

public class SumOfDiagonalElements {

//    Question:- Create a program to find the sum of two diagonal elements.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of rows : ");
        int rows = input.nextInt();

        System.out.print("Please enter the number of columns : ");
        int cols = input.nextInt();

        int[][] numArr = new int[rows][cols];

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < cols) {
                System.out.print("Please enter the value of row  :"
                        + (i + 1) + ", column :" + (j + 1) + " :");
                numArr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        long sum = sumOfDiagonal(numArr);
        System.out.println("sum of two diagonal elements is : "+sum);
      }
      public static long sumOfDiagonal(int[][] numArr){
        long left = sumOfLeftDiagonal(numArr);
        long right = sumOfRightDiagonal(numArr);
        long sum = left+right;
        if (numArr.length % 2 !=0){
            int ind = numArr.length/2;
            sum -=numArr[ind][ind];
        }
        return sum;
    }
    public static long sumOfLeftDiagonal(int[][] numArr){
        int sum = 0;
        int i=0;
        while (i<numArr.length){
            sum += numArr[i][i];
            i++;
        }
        return sum;
    }
    public static long sumOfRightDiagonal(int[][] numArr){
        int sum = 0;
        int i = 0;
        while (i<numArr.length){
            int col = numArr.length-1-i;
            sum += numArr[i][col];
            i++;
        }
        return sum;
    }
}
