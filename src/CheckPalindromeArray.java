import java.util.Scanner;

public class CheckPalindromeArray {

//    Question :- Create a program to check the array is palindrome or not.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of array ");
        int size = input.nextInt();
        int[] arr= new int[size];

        int i=0;
        while (i<size){
            System.out.println("Enter the element value "+(i+1));
            arr[i]=input.nextInt();
            i++;

        }
        boolean palindrome = isPalindrome(arr);
        if (palindrome){
            System.out.println("Given array is a palindrome array");
        }
        else {
            System.out.println("Given array is nat a palindrome array ");
        }
    }

    public static boolean isPalindrome(int [] arr){
        int i =0;

        while (i<arr.length/2){
            if (arr[i] != arr[(arr.length-1)-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
