package test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class B2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int input = Integer.parseInt(str);
        int end = 1;

        List<Integer> endList = new ArrayList();

        endList.add(0);
        endList.add(1);

        int output = 1;

        if(input != 1){
            output = 2;
        }

        while (true) {
            if(input == 0 || input == 1){
                System.out.println(1);
                break;
            }


            int tmp = (6*(output - 1)) + endList.get(endList.size()-1);
            endList.add(tmp);

            if(endList.get(endList.size()-1) >= input && input > endList.get(endList.size()-2)){
                System.out.println(output);
                break;
            }
            output++;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
