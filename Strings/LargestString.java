package Strings;

//time complexcity O(x*n)
public class LargestString {
    public static String largestString(String[] str){
        String largest = str[0];
        for(int i=1;i<str.length;i++){
            if(largest.compareToIgnoreCase(str[i])<0){
                largest = str[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        String[] str = {"apple","mango","banana"};
        System.out.println(largestString(str));
    }
}
