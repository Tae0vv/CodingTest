package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class B1157 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "";

        str = br.readLine();

        char[] tmp = str.toCharArray();

        List<Integer> list = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        List<Integer> cntList = new ArrayList<>();

        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] >= 97) {
                list.add((int) tmp[i] - 32);
            } else {
                list.add((int) tmp[i]);
            }
        }

        Collections.sort(list);

        int cnt = 0;
        for (int i = 0; i < list.size() - 1; i++) {

            cnt++;

            if (list.get(i) != list.get(i + 1)) {
                numList.add(list.get(i));
                cntList.add(cnt);
                cnt = 0;
            }

            if (i == list.size() - 2) {
                if (list.get(i) != list.get(i + 1)) {
                    cnt++;
                    numList.add(list.get(i + 1));
                    cntList.add(cnt);
                    cnt = 0;
                } else {
                    cnt++;
                    cntList.add(cnt);
                    numList.add(list.get(list.size() - 1));
                    cnt = 0;
                }
            }
        }

        if(list.size()==1){
            int output = list.get(0);
            char output2 = (char) output;
            System.out.println(output2);

        }else{

            int max = Collections.max(cntList);
            int fre = Collections.frequency(cntList, max);
            if (fre != 1) {
                System.out.println("?");

            } else {
                int output = numList.get(cntList.indexOf(max));
                char output2 = (char) output;
                System.out.println(output2);
            }
        }
    }
}
