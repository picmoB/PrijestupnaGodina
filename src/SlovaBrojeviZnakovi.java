import java.util.Scanner;

public class SlovaBrojeviZnakovi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Unesi pojam: ");
        String pojam = input.nextLine();

        // Niz brojeva
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        // Varijable
        int slova = 0, brojevi = 0, znakovi = 0;

        for (int i = 0; i < pojam.length(); i++){
            if (Character.isDigit(pojam.charAt(i))){
                brojevi++;
            } else if (Character.isAlphabetic(pojam.charAt(i))) {
                slova++;
            } else {
                znakovi++;
            }
        }
        System.out.println(slova + " " + brojevi + " " + znakovi);
    }
}
