package round08_examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * 5개의 수를 입력받아 큰 순서대로 나열하는 프로그램을 만들어 보자.
 * @author mini
 */
import java.io.*;
public class Round08_HW2 {
    public static int getInt(String str) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(str);
        int imsi = Integer.parseInt(in.readLine());
        return imsi;
    }
    public static void main(String[] ar) throws IOException{
        int[] n = new int[5];
        for(int i = 0; i < 5; i++){
            n[i] = getInt("수" + (i+1) + " = ");
        }
        
        for(int i = 0; i < 5; i++){
            for(int j = i+1; j < 5; j++){
                if(n[i] < n[j]){
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < 4; i++){
            System.out.print(n[i] + " > ");
        }
        System.out.println(n[4]);
    }
}
