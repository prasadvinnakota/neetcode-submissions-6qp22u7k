class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows  =  matrix.length;
        int columns = matrix[0].length;

        int top = 0;
        int bottom = rows-1;

        while(top <= bottom)
        {
            int midRow = (top+bottom)/2;

            if(target >= matrix[midRow][0] && target<=matrix[midRow][matrix[0].length-1])
            {
                int start = 0;
                int end = matrix[0].length-1;

                while(start <= end)
                {
                    int mid = (start+end)/2;
                    if(matrix[midRow][mid]==target)
                    {
                        return true;
                    }
                    else if(matrix[midRow][mid]<target)
                    {
                        start = mid+1;
                    }
                    else
                    {
                        end = mid-1;
                    }
                }
                return false;
            }
            else if(matrix[midRow][0] > target)
            {
                bottom = midRow-1;
            }
            else
            {
                top = midRow+1;
            }
        }
    return false;

    }

}
