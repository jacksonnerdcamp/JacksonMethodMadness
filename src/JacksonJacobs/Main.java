package JacksonJacobs;

public class Main {

    public static void main(String[] args) {
        System.out.println("palindrome: " + Jjacobslib.isPalindrome("bgffgb"));
        System.out.println("cutOut:" + Jjacobslib.cutOut("jackson", "ck"));
        System.out.println("sumUpTo: " + Jjacobslib.sumUpTo(2156));
        System.out.println("primePrinter: " + Jjacobslib.primePrinter(12));
        System.out.println("dateStr: " + Jjacobslib.dateStr("02/27/2001"));
        System.out.println("keyRepeated: " + Jjacobslib.vigCipher("this is a secret messag", "abcd"));
    }
}
