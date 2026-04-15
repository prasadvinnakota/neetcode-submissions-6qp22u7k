class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> s = new Stack<>();
        int result = 0;
        List<String> list = List.of("+", "-", "/", "*");
        for(int i=0; i<tokens.length; i++)
        {
            if(!list.contains(tokens[i]))
            {
                s.push(Integer.valueOf(tokens[i]));
            }
            else
            {
                if(!s.isEmpty() && s.size()>1)
                {
                    Integer b = s.pop();
                    Integer a = s.pop();
                    if(tokens[i].equals("+"))
                    {
                        s.push(a + b);
                    }
                    else if(tokens[i].equals("-"))
                    {
                       s.push(a - b); 
                    }
                    else if(tokens[i].equals("/"))
                    {
                       s.push(a / b); 
                    }
                    else if(tokens[i].equals("*"))
                    {
                       s.push(a * b); 
                    }
                }
            }
            
        }

        return s.peek();
    }
}
