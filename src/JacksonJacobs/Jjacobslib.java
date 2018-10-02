package JacksonJacobs;

public class Jjacobslib {
    public static String isPalindrome(String input)
    {
        String output = "";
        int n = 0;
        for(n = input.length() - 1; n>0; n--)
        {
            output = output + input.substring(n,n+1);
        }
        return output;
    }

    public static String cutOut(String mainStr, String subStr)
    {
        String output = "";
        output = mainStr.substring(mainStr.indexOf(subStr), mainStr.indexOf(subStr) + subStr.length() - 1);
        return output;
    }
}
