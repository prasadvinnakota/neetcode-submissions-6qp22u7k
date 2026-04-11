class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character> row[] = new HashSet[9];
        HashSet<Character> column[] = new HashSet[9];
        HashSet<Character> squares[] = new HashSet[9];

        for(int i=0; i<9; i++)
        {
            row[i] = new HashSet<>();
            column[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }

        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
              if(board[i][j]!='.')
              {
                int squareNumber = (i/3) * 3 + (j/3);
                if(row[i].contains(board[i][j]) || column[j].contains(board[i][j]) || squares[squareNumber].contains(board[i][j]))
                {
                    return false;
                }
                row[i].add(board[i][j]);
column[j].add(board[i][j]);
squares[squareNumber].add(board[i][j]);

              }  
            }
        }

        return true;
    }
}
