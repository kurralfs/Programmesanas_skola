import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Sveiki, esmu Riga Coding programmēšanas skolas chatbot. Kā varu palīdzēt?");

        String input;

        System.out.println(" ");
        input = scan.nextLine();

        if (input.equals("Sveiki")) {
            System.out.println("Sveiki, kā varu palīdzēt?");
        } else if (input.equals("Kas ir programmēšanas skolas Java pasniedzējs?")) {
            System.out.println("Madars");
        } else if (input.equals("Kurā gadā tika dibināta programmēšanas skola?")) {
            System.out.println("2017");
        } else if (input.equals("Kas ir programmēšanas skolas vadītāja?")) {
            System.out.println("Aiga");
        } else {
            System.out.println("Atvaino, nespēšu atbildēt, lūdzu uzdot citu jautājumu");
        }
    }
}