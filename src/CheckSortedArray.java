import java.util.Scanner;

public class CheckSortedArray {

//    Create a program to check if the given array is sorted

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the size of array ");
        int size = input.nextInt();
        int [] numArr = new int[size];

        int i= 0;
        while (i<numArr.length){
            System.out.print("Please enter the element value "+(i+1)+" : ");
            numArr[i]=input.nextInt();
            i++;
        }
        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecreasing(numArr);
        if (isInc || isDec){
            System.out.println("Your array is a sorted array ");
        }
        else {
            System.out.println("Your array is not a sorted array ");
        }
    }

    public static boolean isIncreasing(int[] numArr){
        int i = 1;
        while (i<numArr.length){
            if (numArr[i]<numArr[i-1]){
                return false;
            }

            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] numArr){
        int i=1;
        while (i<numArr.length){
            if (numArr[i]>numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
