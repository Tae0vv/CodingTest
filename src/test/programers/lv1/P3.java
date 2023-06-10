package test.programers.lv1;

import java.util.HashMap;
import java.util.Map;

public class P3 {
    public static void main(String[] args) {

        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};
        int[] answer = solution(park,routes);

        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }

    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        Map<String,Character> parkMap = new HashMap<>();
        String myLocation = "";
        int aMax = park.length-1;
        int bMax = park[0].length() -1;


        for (int i = 0; i < park.length; i++){
            for(int j = 0; j < park[i].length(); j++){

                parkMap.put(i+","+j,park[i].charAt(j));
                if(park[i].charAt(j) == 'S'){
                    myLocation = i+","+j;
                }
            }
        }

        for(int i = 0; i < routes.length; i++){
            boolean boolCheck = false;
            boolean bool = true;

            System.out.println(myLocation);

            String[] res = routes[i].split(" ");

            String direction = res[0];
            int length = Integer.parseInt(res[1]);


            String[] tmp = myLocation.split(",");
            int mapInput = 0;
            int a = Integer.parseInt(tmp[0]);
            int b = Integer.parseInt(tmp[1]);

            if (direction.equals("N")) {
                if (a - length >= 0) {
                    for (int j = a - 1; j >= a - length; j--) {
                        boolCheck = parkMap.get(j + "," + b) == 'X';
                        if (boolCheck) {
                            bool = false;
                            break;
                        }
                    }
                    if (bool) {
                        a = a - length;
                    }
                }
            } else if (direction.equals("S")) {
                if (a + length <= aMax) {
                    for (int j = a + 1; j <= a + length; j++) {
                        boolCheck = parkMap.get(j + "," + b) == 'X';
                        if (boolCheck) {
                            bool = false;
                            break;
                        }
                    }
                    if (bool) {
                        a = a + length;
                    }
                }
            }else if (direction.equals("S")) {
                if (a + length <= aMax) {
                    for (int j = a + 1; j <= a + length; j++) {
                        boolCheck = parkMap.get(j + "," + b) == 'X';
                        if (boolCheck) {
                            bool = false;
                            break;
                        }
                    }
                    if (bool) {
                        a = a + length;
                    }
                }
            } else if (direction.equals("W")) {
                if (b - length >= 0) {
                     mapInput = b - length;
                    for (int j = b - 1; j >= mapInput; j--) {
                        boolCheck = parkMap.get(a + "," + j) == 'X';
                        if (boolCheck) {
                            bool = false;
                            break;
                        }
                    }
                    if (bool) {
                        b = mapInput;
                    }
                }
            } else if (direction.equals("E")) {
                if (b + length <= bMax) {
                     mapInput = b + length;
                    for (int j = b + 1; j <= mapInput; j++) {
                        boolCheck = parkMap.get(a + "," + j) == 'X';
                        if (boolCheck) {
                            bool = false;
                            break;
                        }
                    }
                    if (bool) {
                        b = mapInput;
                    }
                }
            }

            myLocation = a + "," + b;
        }

        answer[0] =Integer.parseInt( myLocation.split(",")[0]);
        answer[1] =Integer.parseInt( myLocation.split(",")[1]);


        return answer;
    }
}
