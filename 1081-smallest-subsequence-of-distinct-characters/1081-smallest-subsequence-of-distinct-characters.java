class Solution {
    public String smallestSubsequence(String s) {
        boolean[] visited = new boolean[26];
        int[] last = new int[26];
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++)
        {
            last[s.charAt(i) - 'a'] = i;
        }

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(visited[ch - 'a'] == true)
            {
                continue;
            }

            while(!st.isEmpty() && ch < st.peek() && i < last[st.peek() - 'a'])
            {
                visited[st.pop() - 'a'] = false;
            }

            st.push(ch);
            visited[ch - 'a'] = true;
        }

        String res = "";
        while(!st.isEmpty())
        {
            res = st.pop() + res;
        }

        return res;
    }
}