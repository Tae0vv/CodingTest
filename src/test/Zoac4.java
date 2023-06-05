package test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Zoac4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] arr = str.split(" ");
        int[] a = new int[arr.length];


        for(int i = 0; i < arr.length; i++){
            a[i] = Integer.parseInt(arr[i]);
        }

        int height = (a[0]%(1+a[2]) != 0) ? a[0]/(1+a[2])+1 : a[0]/(1+a[2]);
        int width = (a[1]%(1+a[3]) != 0) ? a[1]/(1+a[3])+1 : a[1]/(1+a[3]);
        int output = height * width;
        bw.write(output + "\n");
        bw.flush();
        bw.close();
        br.close();

    }


}
