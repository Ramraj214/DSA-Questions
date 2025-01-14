package BitManipulation;

public class OddOrEven {
    public static boolean isOddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(isOddOrEven(21));
    }
}
