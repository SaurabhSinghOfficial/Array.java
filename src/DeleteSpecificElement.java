import java.util.Scanner;

public class DeleteSpecificElement {

//    Question:- Create a program to return a new array deleting a specific element.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the size of the array");
        int size = input.nextInt();
        int[] numArr = new int[size];

        int i=0;
        while (i<size){
            System.out.println("Enter the element value "+(i+1)+" : ");
            numArr[i]=input.nextInt();
            i++;
        }
        System.out.println("Enter the number your want to delete : ");
        int numToDelete = input.nextInt();

        int[] newArr= deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new array ");
        printArr(newArr);

    }
    public static int[] deleteNumber(int[] numArr, int numToDelete){
        int occ=occurrences(numArr, numToDelete);
        if (occ == 0){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i=0,j=0;
        while (i<numArr.length){
            if (numArr[i] != numToDelete){
                newArr[j] =numArr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }

    public static int occurrences(int[] numArr ,int num){
        int occ = 0;
        int i=0;
        while (i<numArr.length){
            if (numArr[i]==num){
                occ++;
            }
            i++;
        }

        return occ;
    }
    public static void printArr(int[] numArr){
        int j=0;
        while (j< numArr.length){
            System.out.print(numArr[j]+" ");
            j++;
        }
        System.out.println();

    }
}
