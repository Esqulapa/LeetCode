class Solution {
     public int titleToNumber(String columnTitle) {           
        int columnValue = 0;
       for(int i=0;i<columnTitle.length();i++)
           columnValue = columnValue * 26 + columnTitle.charAt(i) - 'A' + 1;
        return columnValue;
        
    }
   
}