package test;

import java.io.*;

public class Start {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int a = Integer.parseInt(str);


        for(int i = 0; i < a; i++){
            for(int j = a-1; j-i > 0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
