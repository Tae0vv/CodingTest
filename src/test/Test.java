package test;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        String str = "abAbcaE";
        char[] tmp = str.toCharArray();
        List<Integer> list = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        List<Integer> cntList = new ArrayList<>();

        for(int i = 0; i < tmp.length; i++){
            if(tmp[i] >= 97){
                list.add((int)tmp[i]-32);
            }else{
                list.add((int)tmp[i]);
            }
        }

        //정렬
        for(int i = 0; i < list.size()-1; i++){
            for(int j = i+1; j < list.size(); j++){
                if(list.get(i) <= list.get(j)){
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < list.size()-1; i++){

            cnt++;

            if(list.get(i)!=list.get(i+1)){
                numList.add(list.get(i));
                cntList.add(cnt);
                cnt = 0;
            }

            if(i == list.size()-2){
                if(list.get(i) != list.get(i+1)){
                    cnt++;
                    numList.add(list.get(i+1));
                    cntList.add(cnt);
                    cnt = 0;
                }else{
                    cnt++;
                    cntList.add(cnt);
                    numList.add(list.get(list.size()-1));
                    cnt = 0;
                }
            }
        }


        int max = Collections.max(cntList);
        System.out.println(numList.get(cntList.indexOf(max)));


        System.out.println(cntList);
        cntList.set(2,3);
        int fre = Collections.frequency(cntList,max);
        System.out.println(cntList);
        System.out.println(fre);
        if(fre != 1){

        }
    }
}
