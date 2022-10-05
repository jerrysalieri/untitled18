import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void customArray(int[] Array) {
        Scanner scan = new Scanner(System.in);
        String input;
        int convert;
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Enter the "+ (i+1)+ " value of the array:");
            input=scan.nextLine();
            convert=Integer.parseInt(input);
            Array[i]=convert;

        }

    }
    public static void printArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }


    public static void randomArray(int[] Array) {


        for (int i = 0; i < Array.length; i++) {
            Random random = new Random();
            int num = random.nextInt(10);
            Array[i] = num;
        }

    }

    public static int arraySize() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is array size?");
        String input = scan.nextLine();
        int size = Integer.parseInt(input);
        return size;
    }
    public static void Sort(int[] Array) {
        int temp = 0;
        int iter = 0;
        int replace = 0;
        int n = Array.length;
        for (int i = 0; i < n; i++) {


            for (int j = 1; j < (n - i); j++) {
                iter++;
                if (Array[j - 1] > Array[j]) {
                    temp = Array[j - 1];
                    Array[j - 1] = Array[j];
                    Array[j] = temp;

                    replace++;
                }
            }
        }
        System.out.println("The number of iterations is: " + iter);
        System.out.println("The number of replacements is: " + replace);
    }
    public static void main(String[] args) {
        boolean isTrue=true;
        boolean isTrue2=true;

                    int[] arr = new int[arraySize()];
                    while(isTrue2){
                    System.out.println("Do you want a random array ot you want to put numbers manually? (Enter 'random' or 'manual')");
                    Scanner sc = new Scanner(System.in);
                    String choice = sc.nextLine();

                     while(isTrue) {
                         if (choice.equals("random")) {
                             randomArray(arr);

                             Sort(arr);
                             printArray(arr);
                             isTrue = false;

                         } else if (choice.equals("manual")) {
                             customArray(arr);
                             Sort(arr);
                             printArray(arr);
                             isTrue = false;

                         } else {
                             System.out.println("Enter the correct value please!");
                         }
                         System.out.println("Do you want to continue?");
                         String choice2 = sc.nextLine();
                         if (choice2.equals("Y")) {


                         } else if (choice2.equals("N")) {
                             isTrue2=false;

                         } else {
                             System.out.println("Enter the correct value please!");
                         }
                     }
                }
    }
}
