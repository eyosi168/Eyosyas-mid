
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {



            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();


            int[] numbers = new int[size];

            System.out.println("Enter the numbers for the array:");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }


            System.out.print("Enter the number to be searched: ");
            int numberToSearch = scanner.nextInt();


            int count = 0;
            for (int i = 0; i < size; i++) {
                if (numbers[i] == numberToSearch) {
                    count++;
                }
            }


            if (count == 0) {
                System.out.println("The number " + numberToSearch + " is not present in the array.");
            } else {
                System.out.println("The number " + numberToSearch + " appears " + count + " times in the array.");
            }
}







    
   }