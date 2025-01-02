package ArrayAndString;

public class GreatestCommonDivisorOfStrings {
        public static String gcdOfStrings(String str1, String str2) {
            // Keep reducing the strings until they match
            while (!str1.equals(str2)) {
                if (str1.length() > str2.length()) {
                    // Reduce str1 by removing the prefix that matches str2
                    str1 = str1.substring(str2.length());
                } else {
                    // Reduce str2 by removing the prefix that matches str1
                    str2 = str2.substring(str1.length());
                }
            }
            return str1; // The common prefix is the GCD
        }

        public static void main(String[] args) {
            String str1 = "ABCABC";
            String str2 = "ABC";

            String result = gcdOfStrings(str1, str2);
            System.out.println("GCD of Strings: " + result); // Output: "ABC"
        }
    }