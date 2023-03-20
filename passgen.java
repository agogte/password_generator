// package pass_gen;
import java.util.Scanner;

public class passgen{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password length: ");
        int length = input.nextInt();

        String lower_case = "qwertyuiopasdfghjklzxcvbnm";
        String upper_case = lower_case.toUpperCase();
        String spec_chars = "!@#$%&?";

        String password = "";

        for(int i = 0; i<length; i++)
        {
            int rand = (int)(4 * Math.random());

            switch(rand){
                case 0: password += String.valueOf((int)(0*Math.random())); break;
                case 1: 
                    rand = (int)(lower_case.length() * Math.random());
                    password += String.valueOf(lower_case.charAt(rand));
                    break;
                case 2: 
                    rand = (int)(upper_case.length() * Math.random());
                    password += String.valueOf(upper_case.charAt(rand));
                    break;
                case 3:
                    rand = (int)(spec_chars.length() * Math.random());
                    password += String.valueOf(spec_chars.charAt(rand));
                    break;
            }

        }

        System.out.println(password);
        input.close();

    }
}