class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Loop through the board row wise && check for duplicates
       for(int row=0;row<9;row++){
        HashSet<Character> occurence = new HashSet<>();
        for(int col =0;col<9;col++){
            char element = board[row][col];
            if(element != '.' && !occurence.add(element)){
                return false;
            }
        }
       }

       // loop through columns and check fro duplicates , remember just swap rows and col amongst themselves for column wise traversal
       for(int col=0;col<9;col++){
        HashSet<Character> occurence = new HashSet<>();
        for(int row=0;row<9;row++){
            char element = board[row][col];
            if(element != '.' && !occurence.add(element)){
                return false;
            }
        }
       }


        // loop through 3x3 subarrays
        for(int rowStart = 0; rowStart<9;rowStart += 3){

            for(int colStart = 0;colStart<9;colStart +=3 ){
                //These outer loops switch  grids
                HashSet<Character> seen = new HashSet<>();

                // Now loop through each 3x3 subarray
                for(int row=0;row<3;row++){

                  for(int col=0;col<3;col++){
                    char element = board[rowStart+row][colStart +col];
                    if(element !='.' && !seen.add(element)){
                        return false;
                    };
                  }  

                }
            }
        }
        return true;
    }
}
