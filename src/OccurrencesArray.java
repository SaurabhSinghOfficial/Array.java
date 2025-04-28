import java.util.Scanner;

public class OccurrencesArray {

//    Question :- Create a program to find number of occurrences of an elements in an array

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//for create an array
        System.out.println("Enter the size of array : ");
        int size = input.nextInt();
        int [] numArray = new int[size];
        int i=0;
        while (i<size){
            System.out.println("Enter the element value "+(i+1)+" : ");
            numArray[i]=input.nextInt();
            i++;
        }
//Is used for which number you want to find int the array
        System.out.println("Enter the number you want to found in the array");
        int num=input.nextInt();

        int occurrences=occurrences(numArray,num);
        System.out.println("Your element was found "+occurrences+" times in the array ");
    }
    public static int occurrences(int[] numArray, int num){
        int occ=0;
        int i=0;
        while (i<numArray.length){
            if (numArray[i]==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
