import java.util.Scanner;
class palindrome {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);

        while (true) { // keep asking forever
            System.out.println("Enter a string or type stop to quit:");
            string = scanner.nextLine();
            if (string.equals("stop")) break; // if stop entered - leave the loop
            string = string.toLowerCase().replaceAll(" ", ""); // convert string to LC and remove spaces

            if (string.equals(new StringBuilder(string).reverse().toString()))
                System.out.println(string + " is a palindrome");
            else
                System.out.println(string + " is not a palindrome");
        }
    }
}