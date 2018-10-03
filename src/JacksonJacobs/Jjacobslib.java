package JacksonJacobs;

public class Jjacobslib {
    public static boolean isPalindrome(String input)
    {
        String output = "";
        int n = 0;
        for(n = input.length() - 1; n>=0; n--)
        {
            output = output + input.substring(n,n+1);
        }
        return input.equals(output);
    }

    public static String cutOut(String mainStr, String subStr)
    {
        String output = mainStr.substring(0,mainStr.indexOf(subStr));
        int secondSubIndex = mainStr.indexOf(subStr) + subStr.length();
        output = output + mainStr.substring(secondSubIndex);
        return output;
    }
}
