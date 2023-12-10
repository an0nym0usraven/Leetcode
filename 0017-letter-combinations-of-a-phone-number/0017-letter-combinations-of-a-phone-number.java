import java.util.*;

class Solution {
    static List<String> result;
    static List<List<String>> map;
    static int[] digit;
    static boolean[][] visit;
    static StringBuilder sb;

    public List<String> letterCombinations(String digits) {
        result = new ArrayList<>();
        map = new ArrayList<>();
        sb = new StringBuilder();
        digit = new int[digits.length()];

        if (digits.length() == 0) return result;

        for (int i = 0; i < 10; i++) {
            map.add(new ArrayList<>());
            map.get(i).addAll(mapping(i));
        }

        for (int i = 0; i < digits.length(); i++) {
            digit[i] = digits.charAt(i) - '0';
        }
        visit = new boolean[digit.length][4];

        combination(0);
        
        return result;
    }

    public void combination(int depth) {
        if (depth == digit.length) {
            result.add(sb.toString());
            return;
        }

        for (int i = 0; i < map.get(digit[depth]).size(); i++) {
            if (!visit[depth][i]) {
                visit[depth][i] = true;
                sb.append(map.get(digit[depth]).get(i));
                combination(depth+1);
                sb.delete(sb.length() - 1, sb.length());
                visit[depth][i] = false;
            }
        }
    }

    public List<String> mapping(int number) {
        List<String> list = new ArrayList<>();

        switch (number) {
            case 2: 
                list.addAll(Arrays.asList("a", "b", "c"));
                break;
            case 3:
                list.addAll(Arrays.asList("d", "e", "f"));
                break;
            case 4:
                list.addAll(Arrays.asList("g", "h", "i"));
                break;
            case 5:
                list.addAll(Arrays.asList("j", "k", "l"));
                break;
            case 6:
                list.addAll(Arrays.asList("m", "n", "o"));
                break;
            case 7:
                list.addAll(Arrays.asList("p", "q", "r", "s"));
                break;
            case 8:
                list.addAll(Arrays.asList("t", "u", "v"));
                break;
            case 9:
                list.addAll(Arrays.asList("w", "x", "y", "z"));
                break;
        }

        return list;
    }
}
