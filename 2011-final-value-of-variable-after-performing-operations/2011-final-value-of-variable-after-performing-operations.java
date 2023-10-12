class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for(int i=0; i<operations.length; i++)
        {
            String oper = operations[i];
            switch(oper)
            {
                case "++X":
                    ++X;
                    break;
                case "X++":
                    X++;
                    break;
                case "--X":
                    --X;
                    break;
                case "X--":
                    X--;
                    break;
            }
        }
        return X;
    }
}