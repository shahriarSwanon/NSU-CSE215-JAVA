import java.util.Scanner;
public class p4 {
     static boolean isValidPassword(String password) {
        if (password.length() < 6) {
            return false;
        }
        if (!Character.isDigit(password.charAt(password.length() - 1))) {
            return false;
        }
        boolean hasDigit = false;
        boolean hasLetter = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLetter(c)) {
                hasLetter = true;
            }
        }
        return hasDigit && hasLetter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = sc.nextLine();
        boolean isValid = isValidPassword(password);
        if(isValid==true)
        {
            System.out.println("Password is valid.");
        }
        else
        {
            System.out.println("Password is Invalid.");
        }
    }
}
