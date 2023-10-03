package algo10_03;

import java.util.stream.IntStream;

public class Solution2 {
    private static final int[][] RULES = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5,}
    };

    private  int getPicked(int person, int problem){
        int[] rule = RULES[person];
        int index = problem % rule.length;
        return rule[index];
    }

    public int[] solution(int[] answers){
        int[] corrects = new int[3];
        int max=0;

        for(int probelm =0; probelm<answers.length;probelm++){
            int answer = answers[probelm];

            for(int person = 0; person<3; person++){
                int picked = getPicked(person,probelm);
                if(answer == picked){
                    if(++corrects[person]>max){
                        max = corrects[person];
                    }
                }
            }
        }

        final int maxCorrets = max;
        return IntStream.range(0,3).filter(i -> corrects[i] == maxCorrets).map(i -> i+1).toArray();
    }
}
