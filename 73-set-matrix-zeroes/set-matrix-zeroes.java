class Solution {
    public void setZeroes(int[][] matrix) {
        boolean [] rows = new boolean [matrix.length];
        boolean [] cols  = new boolean [matrix[0].length];
        //first check for zeros
        for(int r=0 ; r<matrix.length; r++){
            for(int c=0 ; c<matrix[r].length ; c++){
                if(matrix[r][c]==0){
                    rows[r]=true ;
                    cols[c]=true ;
                }
            }
        }

        // now upadate rows and cols of the matrix

        for(int r=0 ; r<matrix.length ; r++){
            for(int c=0 ; c<matrix[0].length; c++){
                if(rows[r]||cols[c]){
                    matrix[r][c]=0 ;
                }
            }
        }
    }
}