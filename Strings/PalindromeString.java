package Strings;

//time complexcity O(n/2)
public class PalindromeString {
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;//not a palindrome
            }
        }
        return true;
    }

    public static void main(String[] args){
        String str = "Racecar";
        str = str.toLowerCase();
        System.out.println(isPalindrome(str));
    }
}
