class Solution {
    public boolean isPowerOfFour(int n) {
        if(n < 1 ) {
            return false;
        }
        if(n == 1) {
            return true;
        }
        if((n&(n - 1)) == 0 && (Integer.toBinaryString(n).length() -1) % 2 == 0) {
            return true;
        }

        return false;
    }
}