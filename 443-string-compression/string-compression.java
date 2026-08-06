class Solution {
    public int compress(char[] chars) {
        int read = 0 ; 
        int write = 0 ; 

        while(read<chars.length){
            char currentChar = chars[read];
            int count = 0 ; 

            while(read<chars.length && chars[read]==currentChar){
                read++;
                count++;
            }

            //write the charactor in the string 

            chars[write]=currentChar ;
            write++;

            //write the number into the array 

            if(count > 1){
                for(char digit : Integer.toString(count).toCharArray()){
                    chars[write]=digit ;
                    write++;
                }
            }
            
        }
        return write ;
    }
}