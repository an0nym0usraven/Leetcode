class Solution {
    public boolean winnerOfGame(String colors) {
        if(colors.length() < 3)
        {
            return false;
        }

        int movesA = 0;
        int movesB = 0;

        for(int i=0; i<colors.length()-2; i++)
        {
            if(colors.charAt(i) == 'A')
            {
                if(colors.charAt(i+1) == 'A' && colors.charAt(i+2) == 'A')
                {
                    movesA += 1;
                }
            }
            else if(colors.charAt(i) == 'B')
            {
                if(colors.charAt(i+1) == 'B' && colors.charAt(i+2) == 'B')
                {
                    movesB += 1;
                }
            }
        }

        return (movesA - movesB >= 1);
    }
}