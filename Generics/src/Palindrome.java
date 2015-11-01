/**
 * Created by Elliott on 01/11/2015.
 */
public class Palindrome {

    // Using same sorting from Strings#Reversing
    public static <T> boolean isPalindrome(T t) {
        String value = t.toString();
        String reversed = "";
        for (int i = value.length(); i > 0; i--) {
            reversed += value.charAt(i - 1);
        }
        System.out.println("Value: " + value);
        System.out.println("Reversed: " + reversed);
        if (reversed.equals(value))
            return true;

        return false;
    }

}
