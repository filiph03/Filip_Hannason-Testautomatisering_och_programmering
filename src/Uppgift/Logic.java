package Uppgift;

import java.util.HashMap;
import java.util.Scanner;

public class Logic {

    private String[] myInputArray;
    private String output = "";

    public void translateEnglish(String input) {
        Scanner scan = new Scanner(System.in);
        boolean containsNull = true;
        String check = input;

        while (containsNull) {
            output = "";
            String inputToUpper = check.toUpperCase();
            myInputArray = inputToUpper.split("");
            for (int i = 0; i < check.length(); i++) {
                output += myHashMap.get(myInputArray[i]);
                output += " ";
            }
            if (!output.contains("null")) {
                containsNull = false;
            } else {
                System.out.println("Fel inmatning, endast engelska bokstäver samt nummer & dem här: ',' '.'"
                        + "\n" + "Gör om & gör rätt:");
                check = scan.nextLine();
            }
        }
    }

    public void translateMorse(String input) {
        Scanner scan = new Scanner(System.in);
        boolean containsNull = true;
        String check = input;

        while (containsNull) {
            output = "";
            myInputArray = check.split(" ");
            for (String s : myInputArray) {
                output += reversedMyHashMap.get(s);
            }
            if (!output.contains("null")) {
                containsNull = false;
            } else {
                System.out.println("Fel inmatning, använd dig bara utav dessa tecken: '.' '-' '/' eller 'mellanslag'."
                        + "\n" + "Gör om & gör rätt:");
                check = scan.nextLine();
            }
        }
    }

    public String getOutput() {
        return output.trim();
    }

    static HashMap<String, String> myHashMap = new HashMap<>();

    static {
        myHashMap.put(" ", "/");
        myHashMap.put("A", ".-");
        myHashMap.put("B", "-...");
        myHashMap.put("C", "-.-.");
        myHashMap.put("D", "-..");
        myHashMap.put("E", ".");
        myHashMap.put("F", "..-.");
        myHashMap.put("G", "--.");
        myHashMap.put("H", "....");
        myHashMap.put("I", "..");
        myHashMap.put("J", ".---");
        myHashMap.put("K", "-.-");
        myHashMap.put("L", ".-..");
        myHashMap.put("M", "--");
        myHashMap.put("N", "-.");
        myHashMap.put("O", "---");
        myHashMap.put("P", ".--.");
        myHashMap.put("Q", "--.-");
        myHashMap.put("R", ".-.");
        myHashMap.put("S", "...");
        myHashMap.put("T", "-");
        myHashMap.put("U", "..-");
        myHashMap.put("V", "...-");
        myHashMap.put("W", ".--");
        myHashMap.put("X", "-.-");
        myHashMap.put("Y", "-.--");
        myHashMap.put("Z", "--..");
        myHashMap.put("1", ".----");
        myHashMap.put("2", "..---");
        myHashMap.put("3", "...--");
        myHashMap.put("4", "....");
        myHashMap.put("5", ".....");
        myHashMap.put("6", "-....");
        myHashMap.put("7", "--...");
        myHashMap.put("8", "---..");
        myHashMap.put("9", "----.");
        myHashMap.put("0", "-----");
        myHashMap.put(".", ".-.-.-");
        myHashMap.put(",", "--..--");
    }

    static HashMap<String, String> reversedMyHashMap = new HashMap<>();

    static {
        reversedMyHashMap.put(" ", "");
        reversedMyHashMap.put("/", " ");
        reversedMyHashMap.put(".-", "A");
        reversedMyHashMap.put("-...", "B");
        reversedMyHashMap.put("-.-.", "C");
        reversedMyHashMap.put("-..", "D");
        reversedMyHashMap.put(".", "E");
        reversedMyHashMap.put("..-.", "F");
        reversedMyHashMap.put("--.", "G");
        reversedMyHashMap.put("....", "H");
        reversedMyHashMap.put("..", "I");
        reversedMyHashMap.put(".---", "J");
        reversedMyHashMap.put("-.-", "K");
        reversedMyHashMap.put(".-..", "L");
        reversedMyHashMap.put("--", "M");
        reversedMyHashMap.put("-.", "N");
        reversedMyHashMap.put("---", "O");
        reversedMyHashMap.put(".--.", "P");
        reversedMyHashMap.put("--.-", "Q");
        reversedMyHashMap.put(".-.", "R");
        reversedMyHashMap.put("...", "S");
        reversedMyHashMap.put("-", "T");
        reversedMyHashMap.put("..-", "U");
        reversedMyHashMap.put("...-", "V");
        reversedMyHashMap.put(".--", "W");
        reversedMyHashMap.put("-..-", "X");
        reversedMyHashMap.put("-.--", "Y");
        reversedMyHashMap.put("--..", "Z");
        reversedMyHashMap.put(".----", "1");
        reversedMyHashMap.put("..---", "2");
        reversedMyHashMap.put("...--", "3");
        reversedMyHashMap.put("....-", "4");
        reversedMyHashMap.put(".....", "5");
        reversedMyHashMap.put("-....", "6");
        reversedMyHashMap.put("--...", "7");
        reversedMyHashMap.put("---..", "8");
        reversedMyHashMap.put("----.", "9");
        reversedMyHashMap.put("-----", "0");
        reversedMyHashMap.put(".-.-.-", ".");
        reversedMyHashMap.put("--..--", ",");
    }
}