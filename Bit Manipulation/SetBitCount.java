/*
Write an efficient program to count the number of 1s in the binary representation of an integer.
Examples :

Input : n = 6
Output : 2
Binary representation of 6 is 110 and has 2 set bits

Input : n = 13
Output : 3
Binary representation of 13 is 1101 and has 3 set bits
 */
public class SetBitCount {
    public static void main(String[] args) {
        int num = 13;
        System.out.println(getSetBitCount(num));
       // System.out.println(Integer.bitCount(num));
    }
    private static int getSetBitCount(int num) {
        int count = 0;
        String str = Integer.toBinaryString(num);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1')
                count++;
        }
        return count;
    }
}
