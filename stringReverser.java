import java.util.Scanner;

public class stringReverser {

    public static void main(String[] args) {

        System.out.println("Enter a string to be reversed");
        Scanner read = new Scanner(System.in);
        String s = read.nextLine();
        String reverse = "";

        for(int i = s.length() - 1; i >= 0; i--)
        {
          reverse = reverse + s.charAt(i);
        }

        System.out.println("Your string reversed is: " + reverse);

    }


}
