/**
Runtime: 3 ms, faster than 100.00% of Java online submissions for Roman to Integer.
Memory Usage: 39 MB, less than 99.80% of Java online submissions for Roman to Integer.


**/

class Solution {
    public int romanToInt(String s) {

        int result= 0; 
        int i=s.length()-1; 
        int curr=0; 
        int pastNo=s.charAt(s.length()-1); 
        
        while (i>=0) {            
            pastNo=curr; 

        switch(s.charAt(i)) { 
            case 'I' : curr= 1; break;
            case 'V' : curr= 5; break; 
            case 'X' : curr= 10; break; 
            case 'L' : curr= 50; break;
            case 'C' : curr= 100; break; 
            case 'D' : curr= 500; break; 
            case 'M' : curr= 1000; break;  
        }
            
            if(pastNo > curr) 
                result=result-curr;
            else 
                result=result+curr; 
            
            i--; 
        }
        
    //    result=Math.abs(result);
        return result; 
    }
}
