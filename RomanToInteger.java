class RomanToInteger {
    public int romanToInt(String s) {
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res = 0;

        for (int i=0; i<arr.length;i++)
        {
            int curr = map.get(arr[i]);
            int next = 0;

            if (i != arr.length - 1)
                next = map.get(arr[i+1]);
            
            if (curr >= next)
            {
                res += curr;
            }
            else
            {
                res += Math.abs(next - curr);
                i++;
            }
        }

        return res;

    }
}
