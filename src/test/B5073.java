package test;

import java.io.*;

public class B5073 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){

            String str = br.readLine();
            String[] arr = str.split(" ");

            int[] inputArr = new int[arr.length];

            for(int i = 0; i < arr.length; i++){
                inputArr[i] = Integer.parseInt(arr[i]);
            }

            if(inputArr[0] == 0 && inputArr[1] == 0 && inputArr[2] == 0){
                break;
            }

            int tmp = 0;
            String output = "";

            for(int i = 0 ; i < inputArr.length; i++){
                for(int j = 1; j < inputArr.length; j++){
                    if(inputArr[i] < inputArr[j]){
                        tmp = inputArr[i];
                        inputArr[i] = inputArr[j];
                        inputArr[j] = tmp;
                    }
                }
            }



            if(inputArr[0] < inputArr[1] + inputArr[2]){
                if((inputArr[0] == inputArr[1]) && (inputArr[1] == inputArr[2])){
                    output = "Equilateral";
                }else if((inputArr[0] != inputArr[1]) && (inputArr[1] != inputArr[2]) &&(inputArr[0] != inputArr[2])){
                    output = "Scalene";
                }else {
                    output = "Isosceles";
                }
            }else{
                output = "Invalid";
            }

            bw.write(output + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
