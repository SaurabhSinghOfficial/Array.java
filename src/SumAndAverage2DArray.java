import java.util.Scanner;

public class SumAndAverage2DArray {

//    Question:- Create a program to do sum and average of all elements in a 2-D array.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of rows : ");
        int rows = input.nextInt();
        System.out.print("Please enter the number of columns : ");
        int columns = input.nextInt();

        int[][] numArr = new int[rows][columns];

        int i=0;
        while (i<rows){
            int j =0;
            while (j<columns){
                System.out.print("Please enter the value of row : "+ (i+1)+" ,columns : " +(j+1)+" :");
               numArr[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        long sum = sum(numArr);
        double avg = average(numArr);
        System.out.println("Sum of 2-D Array is : "+sum);
        System.out.println("Average of 2-D Array is : "+avg);
    }
    public static long sum(int[][] numArr){
        int sum = 0;
        int i=0;
        while (i<numArr.length){
            int j=0;
            while (j<numArr[i].length){
                sum +=numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double average(int[][] numArr){
        if(numArr.length == 0){
            return 0;
        }
        int row = numArr.length;
        int  cols = numArr[0].length;
        double size = row*cols;

        return sum(numArr)/(size);
    }
}
