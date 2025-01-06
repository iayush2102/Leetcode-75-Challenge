package ArrayAndString;

import java.util.Stack;

public class ReverseVowelsOfAString {
    public static String reverseVowels(String s) {

        String vowels = "aeiouAEIOU";
        Stack <Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(vowels.indexOf(c) != -1){
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(vowels.indexOf(c) != -1){
                sb.append(stack.pop());
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "IceCream";
        System.out.println(reverseVowels(s));
    }
}
