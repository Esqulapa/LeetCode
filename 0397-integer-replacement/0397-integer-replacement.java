class Solution {
    public int integerReplacement(int n) {
long number = (long)n;

        int numberToBe = 1;
        int counter = 0;

        while (number > numberToBe) {
            if (number % 2 == 0) {
                number /= 2;
                counter++;

            } else if( (number + 1)%2 == 0 && (number + 1) / 2 % 2 == 0 && (number + 1) != 4  ) {
                number++;
                counter++;
            }else {
                number--;
                counter++;
            }
        }
        return counter;
    }
}