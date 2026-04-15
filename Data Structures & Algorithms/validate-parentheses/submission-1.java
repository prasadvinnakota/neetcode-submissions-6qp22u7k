class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> s1= new Stack<>();

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='}')
            {
                if(s1.isEmpty()) return false;
Character c = s1.pop();
                if(c!='{')
                {
                    return false;
                }
            }
            else if(s.charAt(i)==']')
            {
                                if(s1.isEmpty()) return false;

                Character c = s1.pop();
                if(c!='[')
                {
                    return false;
                }
            }
            else if(s.charAt(i)==')')
            {
                                if(s1.isEmpty()) return false;

                Character c = s1.pop();
                if(c!='(')
                {
                    return false;
                }
            }
            else
            {
                s1.push(s.charAt(i));
            }
        }

        if(s1.size()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
