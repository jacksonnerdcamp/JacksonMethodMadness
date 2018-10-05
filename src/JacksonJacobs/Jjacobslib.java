package JacksonJacobs;
//this is the indicator
public class Jjacobslib {
    public static boolean isPalindrome(String input)
    /*To check if the input was a palindrome, I created a new string and added every letter from the input from last to first.
    Then I could check the output against the input to determine if it was a palindrome or not.*/
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
    /*The cutOut method did not require any loops, but I had to account for inputs where the subStr happened to be in
    the middle. Therefore, I created a substring of characters before the target word, and a substring of characters after.
    Finally I could concatenate these substrings and the output was returned.*/
    {
        String output = mainStr.substring(0,mainStr.indexOf(subStr));
        int secondSubIndex = mainStr.indexOf(subStr) + subStr.length();
        output = output + mainStr.substring(secondSubIndex);
        return output;
    }

    public static int sumUpTo(int input)
    /*The sumUpTo method only required me to establish an int output that became the sum of consecutive integers as they
    were counted up over a for loop. The loop terminated when the iterator reached the input value.*/
    {
        int output = 0;
        for(int counter = 0; counter <= input; counter++)
        {
            output += counter;
        }
        return output;
    }

    public static boolean isPrime(int input)
    /*I created this method so that the primePrinter method would be more readable. All this does is it checks if the
    input is a prime number by finding the remainder of it divided by every number leading up to it. If input mod num is
    zero (meaning num is a factor of the input) the output is set to false; otherwise it defaults to true.*/
    {
        boolean output = true;
        for (int n = 2; n < input; n++) {
            if (input % n == 0) {
                output = false;
                break;
            }
        }
        return output;
    }

    public static int primePrinter(int num)
    /*Because the prime number checker is already made, all this code needs to do is loop through the integers below the
    input, while a counter increases each time a prime number is detected.*/
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

    public static String dateStr(String input)
    //Nothing to see here, just using substrings to rearrange the input and return the new string.
    {
        return input.substring(3,5) + " - " + input.substring(0,2) + " - " + input.substring(6);
    }

    //Extra Credit Problems Begin Here
    public static String vigCipher(String message, String key)
    {
        String output = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        String keyRepeated = "";
        for(int n = 0; n < message.length(); n += key.length())
        {
            keyRepeated = keyRepeated + key;
        }
        System.out.println(message.length());
        System.out.println(keyRepeated.length());
        return keyRepeated;
    }
}
