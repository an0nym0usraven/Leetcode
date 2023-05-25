import java.util.*;

class IntegerToRoman {
    public static String intToRoman(int num) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1000,"M");
        map.put(500,"D");
        map.put(100,"C");
        map.put(50,"L");
        map.put(10,"X");
        map.put(5,"V");
        map.put(1,"I");
        System.out.println(map.keySet());
        StringBuilder str = new StringBuilder();

        for(int i : map.keySet())
        {
            if(num >= i)
            {
                str.append(map.get(i));
                num -= i;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3));
    }
}
