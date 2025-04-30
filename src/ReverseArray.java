import java.util.Scanner;

public class ReverseArray {

//    Question:- Create a program to reverse an array.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array ");
        int size = input.nextInt();
        int[] arr = new int[size];

        int i=0;
        while (i<size){
            System.out.println("Enter the element values "+(i+1)+" :");

            i++;
        }
       reverse(arr);
        System.out.println("Your reverse array is : ");
        printArr(arr);

    }
    public static void reverse(int[] arr){
       int i=0;
       while (i<arr.length/2){
           int swap = arr[i];
           arr[i]= arr[(arr.length-1)-i];
          arr [(arr.length-1)-i] =swap;
           i++;
       }
    }

    public static void printArr(int[] arr){
        int i=0;
        while (i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
    }
}
