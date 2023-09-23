package algo09_23;

public class Solution2 {
    boolean solution(String s){
        s = s.toLowerCase();

        int ps = s.length() - s.replace("p","").length();
        int ys = s.length() - s.replace("y","").length();
        return ps == ys;
    }
}
