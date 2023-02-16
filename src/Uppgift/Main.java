package Uppgift;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logic myInput = new Logic();


        boolean running = true;
        while (running) {
            System.out.println("Vad vill du översätta morse eller engelska?");

            String input = scan.nextLine();
            String inputUpper = input.toUpperCase();

            if (inputUpper.equals("ENGELSKA")) {
                System.out.println("Skriv något du vill översätta till morse:");
                myInput.translateEnglish(scan.nextLine());
                running = false;
            } else if (inputUpper.equals("MORSE")) {

                System.out.println("Skriv något på morse som du vill översätta till engelska:");
                myInput.translateMorse(scan.nextLine());
                running = false;
            } else {
                System.out.println("Gör om & gör rätt");
            }
        }
        System.out.println(myInput.getOutput());
    }
}