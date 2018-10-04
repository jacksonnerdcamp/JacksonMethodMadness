package JacksonJacobs;
//this is the indicator
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

    public static int sumUpTo(int input)
    {
        int output = 0;
        for(int counter = 0; counter <= input; counter++)
        {
            output += counter;
        }
        return output;
    }

    public static boolean isPrime(int input)
    {
        int output = 0;
        for (int n = 2; n < input; n++) {
            if (input % n == 0) {
                output++;
                break;
            }
        }
        if (output == 0) return true;
        else return false;
    }

    public static int primePrinter(int num)
    {
        int counter = 0;
        for(int n = 3; n <= num; n++)
        {
            if(isPrime(n))
            {
                counter++;
            }
        }
        return counter;
    }

}
