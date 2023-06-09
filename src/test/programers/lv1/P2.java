package test.programers.lv1;

import java.util.*;
import java.util.stream.Collectors;

public class P2 {
    public static void main(String[] args) {
        String[] name = {"AAA","BBB","CCC"};
        int[] yearning = {11,1,55};
        String[][] photo = {{"AAA","BBB","CCC"},{"BBB","DDD","EEE"},{"CCC","GGG","FFF"}};

        int[] arr = solution(name,yearning,photo);
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());

        System.out.println(arrList);

    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i < name.length; i++){
            map.put(name[i],yearning[i]);
        }

        for(int i = 0; i < photo.length; i++){
            int sum = 0;
            for(int j = 0; j < photo[i].length; j++){
                if(map.containsKey(photo[i][j])){
                    sum += map.get(photo[i][j]);
                }
            }
            answer[i] = sum;
        }

        return answer;
    }
}
