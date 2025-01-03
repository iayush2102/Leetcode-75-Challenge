package ArrayAndString;

public class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        int lengthOfGCD = 0;

        if((str1 + str2).equals(str2 + str1)){
            lengthOfGCD = gcd(str1.length(), str2.length());
        } else {
            return "";
        }
        return str1.substring(0, lengthOfGCD);
    }

    public static int gcd (int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
        public static void main(String[] args) {
            String str1 = "ABCABC";
            String str2 = "ABC";

            String result = gcdOfStrings(str1, str2);
            System.out.println("GCD of Strings: " + result); // Output: "ABC"
        }
    }