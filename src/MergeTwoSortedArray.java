import java.util.Scanner;

public class MergeTwoSortedArray {

//    Question:- Create a program to merge two sorted array.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of first array ");
        int size1 = input.nextInt();
        int[] arr1 = new int[size1];
        int i = 0;
        while (i<size1){
            System.out.print("Enter the element values of first array "+(i+1)+" : ");
            arr1[i]=input.nextInt();
            i++;
        }

        System.out.println("Enter the size of second array ");
        int size2 =input.nextInt();
        int[] arr2 = new int[size2];

        int  j=0;


        while (j<size2){
            System.out.print("Enter the element values of second array"+(j+1)+" : ");
            arr2[j]=input.nextInt();
            j++;
        }
        int[] mergeArr=merge(arr1, arr2);
        System.out.print("Your merged array is : ");
        displayArr(mergeArr);

    }
    public static int[] merge(int[] arr1, int[] arr2){
        int newSize =  arr1.length+ arr2.length;
        int[] newArr = new int[newSize];

        int i=0, j=0, k=0;

        while (i<arr1.length || j<arr2.length){
            if (j == arr2.length ||(i <arr1.length && arr1[i]<arr2[j])){
                newArr[k] = arr1[i];
                i++;
                k++;
            }
            else {
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArr;
    }

    public static void displayArr(int[] arr){
        int i=0;
        while (i< arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
    }
}
