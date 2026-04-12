class Solution {
    public boolean isPalindrome(String s) {
        
        s= s.toLowerCase();
        int start = 0;
        int end = s.length()-1;

        while(start < end)
        {
            char left = s.charAt(start);
            char right = s.charAt(end);

            // Skip non-alphanumeric on left
            if (!((left >= '0' && left <= '9') ||
                  (left >= 'A' && left <= 'Z') ||
                  (left >= 'a' && left <= 'z'))) {
                start++;
            }
            // Skip non-alphanumeric on right
            else if (!((right >= '0' && right <= '9') ||
                       (right >= 'A' && right <= 'Z') ||
                       (right >= 'a' && right <= 'z'))) {
                end--;
            }

            else
            {
                if(left != right)
                {
                    return false;
                }
                start++;
                end--;

            }

        }

        return true;
    }
}
