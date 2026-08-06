class Solution {
    public int compress(char[] arr) {
       

     StringBuilder s = new StringBuilder();

        if(arr.length == 1){
            s.append(arr[0]);
            arr[0]=arr[0];
            return 1 ;
        }

		int count = 1 ; 
		for(int i=0 ; i<arr.length-1 ; i++) {
            
			
			if(arr[i]==arr[i+1]) {
				count++;
				
			}else {
			  s.append(arr[i]);
			  if(count>1){
                s.append(count);
              }
			  count =1 ;
			}
			
		}
		 s.append(arr[arr.length - 1]);
         if(count>1){
		 s.append(count);
         }
		for(int i=0 ;i<s.length() ; i++) {
			arr[i] = s.charAt(i);
		}
		
        return s.length();
        

    }
}