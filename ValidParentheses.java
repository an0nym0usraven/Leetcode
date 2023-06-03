class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stc = new Stack<Character>();

        for (char i : s.toCharArray())
        {
            if (i == '(')
            {
                stc.push(')');
            }
            else if (i == '{')
            {
                stc.push('}');
            }
            else if (i == '[')
            {
                stc.push(']');
            }
            else 
            {
                if (stc.isEmpty() || stc.pop() != i)
                return false;
            }
        }
        return stc.isEmpty();
    }
}
