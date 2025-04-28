import java.util.Scanner;

public class MaxAndMinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array ");
        int size = input.nextInt();
        int[] numArray = new int[size];

        int i=0;
        while (i<size){
            System.out.println("Enter the element value "+(i+1)+" : ");
            numArray[i] = input.nextInt();
            i++;
        }
        int maximum = maximum(numArray);
        int minimum = minimum(numArray);
        System.out.println("Maximum element value are present in the array is : "+maximum);
        System.out.println("Minimum element value are present in the array is : "+minimum);
    }

    public  static int maximum(int[] numArray){
          if (numArray.length == 0){
              return Integer.MIN_VALUE;
          }
          int max = numArray[0];
          int i = 1;
          while (i<numArray.length){
              if (max<numArray[i]){
                  max = numArray[i];
              }
              i++;
          }

        return max;
    }

    public static int minimum(int[] numArray){
        int min= Integer.MAX_VALUE;
        int i = 0;
        while (i<numArray.length){
            if (min>numArray[i]){
                min = numArray[i];
            }
            i++;
        }
        return min;
    }
}
