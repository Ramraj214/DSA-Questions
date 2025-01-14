package BitManipulation;

public class BitOperations {
    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        return 1;
    }

    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n,int i,int newbit){
        if(newbit == 0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }

    public static int clearLastIBits(int n,int i){
        int bitMask = ((~0)<<i);
        return bitMask & n;
    }

    public static int clearRangeOfBits(int n,int i,int j){
        int a = (1<<i)-1;
        int b = (~0)<<(j+1);
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(clearRangeOfBits(31, 2, 4));//11111
        System.out.println(isPowerOfTwo(4));
        System.err.println(countSetBits(15));
    }
}
