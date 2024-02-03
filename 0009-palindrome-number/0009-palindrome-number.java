class Solution {
    public boolean isPalindrome(int x) {          

                String intAsString = String.valueOf(x);
                String reversedValue = "";
                char singleChar;
                
                for(int i = 0; i < intAsString.length(); i++){
                    singleChar = intAsString.charAt(i);
                    reversedValue = singleChar + reversedValue;                    
                }
                
                if (intAsString.equals(reversedValue)){
                    return true;
                }
        return false;       
     }
}


        
    
