class Solution {
    public int integerReplacement(int n) {
        
        if(n == Integer.MAX_VALUE) return 32;
     int numberToBe = 1;
        int counter = 0;

        while (n != numberToBe) {
            if (n % 2 == 0) {
                n /= 2;
                counter++;
            }else if( (n + 1)%2 == 0 && (n + 1) / 2 % 2 == 0 && (n + 1) != 4) {
                n++;
                counter++;
            }else {
                n--;
                counter++;
            }            
        }
        return counter;
    }
}