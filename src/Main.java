import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a num: ");

        int num1 = scan.nextInt();

        if (num1 >= 0) {
            if (num1 % 2 == 1) { //Odd
                if (num1 % 5 == 0) {
                    System.out.println("Divisable by 5");
                }
                if (num1 % 7 == 0) {
                    System.out.println("Divisable by 7");
                }

                if (num1 % 5 != 0 && num1 % 7 != 0) {
                    System.out.println("Not divisable by 5 or 7");
                }
            }
            if (num1 % 2 == 0) {
                if (num1 > 1000) {
                    System.out.println("Big even Number");
                } else if (num1 > 100) {
                    System.out.println("Medium even number");
                } else {
                    System.out.println("Small even number");
                }

            }
        } else {
            System.out.println("That isn't positive");
        }
    }   }