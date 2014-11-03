/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round06;

/**
 * 구구단을 출력하는 프로그램을 작성해 보자.
 * @author Home
 */
import java.io.*;
public class Round06_HW4 {
    public static void main(String[] ar) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("단수 = ");
        int n = Integer.parseInt(in.readLine());
        System.out.println("=== " + n + " 단 ===");
        for(int i=1;i<10;i++){
            System.out.printf("%d * %d = %2d\n",n,i,n*i);
        }
        System.out.println("=== " + n + " 단 ===");
    }
}
