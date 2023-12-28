class Solution {
    public int[] singleNumber(int[] nums) {
        int XOR = 0;
        for(int num: nums){
            XOR ^= num;
        }

        int count = 0;
        while(XOR != 0){
            if((XOR & 1) == 1) 
                break;
            XOR >>= 1;
            count++;
        }

        int XOR1 = 0;
        int XOR2 = 0;
        for(int num: nums){
            if((num & (1 << count)) != 0){
                XOR1 ^= num;
            }
            else XOR2 ^= num;
        }
        
        return new int[]{XOR1, XOR2};
    }
}