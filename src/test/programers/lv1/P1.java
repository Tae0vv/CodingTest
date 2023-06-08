package test.programers.lv1;

import java.util.*;

public class P1 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

       String[] answer =  solution(players,callings);
    }


    public static String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        String tmp = "";
        String who = "";
        int idx = 0;


        List<String> playersList = new ArrayList<String>(Arrays.asList(players));
        List<String> calllingList = new ArrayList<String>(Arrays.asList(callings));

        Map<String,Integer> playerMap = new HashMap<>();
        Map<Integer,String> rankMap = new HashMap<>();

        for(int i = 0; i < playersList.size(); i++){
            playerMap.put(playersList.get(i),i);
            rankMap.put(i,playersList.get(i));
        }

        for(int i = 0; i < calllingList.size(); i++){
            String callingPlayer = calllingList.get(i);
            int callingRank = playerMap.get(callingPlayer);
            String frontPlayer = rankMap.get(callingRank-1);

            playerMap.put(callingPlayer,callingRank-1);
            playerMap.put(frontPlayer,callingRank);

            rankMap.put(callingRank-1,callingPlayer);
            rankMap.put(callingRank,frontPlayer);
        }

        for(int i = 0; i < playersList.size(); i++){
            answer[i] = rankMap.get(i);
        }

        return answer;
    }
}
