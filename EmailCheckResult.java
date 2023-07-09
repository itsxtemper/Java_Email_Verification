package auth;

import java.util.Scanner;

public class EmailCheckResult {
    public static boolean main(String Email) {
         emailSender.sendSimpleMessage(Email);
        System.out.println("ENTER THE RECEIVED CODE");
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt() == emailSender.code)
        {
            return true;
        }
         return false;
    }
}
