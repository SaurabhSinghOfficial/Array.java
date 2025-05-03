import java.util.Scanner;

public class SearchElementIn2DArray {

//    Question:- Create a program to search an elements in a 2-D array.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of rows : ");
        int rows = input.nextInt();
        System.out.println("Please enter the number of columns : ");
        int columns = input.nextInt();

        int [][] numArray = new int[rows][columns];

        int i = 0 ;
        while (i<rows){
            int j=0;
            while (j<columns){
                System.out.print("Please the value of row : "+(i+1)+" ,columns : "+(j+1)+" :");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        System.out.println("Now enter the number you want to search : ");
        int searchNum = input.nextInt();

        boolean isFound = searchElement(numArray,searchNum);
        if(isFound){
            System.out.println("Your number is in the 2-D Array ");
        }
        else {
            System.out.println("Your number is not in the 2-D Array ");
        }
    }
    public static boolean searchElement(int[][] numArr, int num){
        int i = 0;
        while (i<numArr.length){
            int j =0;
            while (j<numArr[i].length){
                if (numArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
