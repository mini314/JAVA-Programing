/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round06;

/**
 *
 * @author Home
 */
import java.io.*;
public class Round06_Ex02 {
    public static void main(String[] ar) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int firstsu = 0, secondsu = 0, thirdsu = 0;
        int imsi = 0;
        
        System.out.print("첫번째 수 = ");
        firstsu = Integer.parseInt(in.readLine());
        System.out.print("두번째 수 = ");
        secondsu = Integer.parseInt(in.readLine());
        System.out.print("세번째 수 = ");
        thirdsu = Integer.parseInt(in.readLine());
        
        if(secondsu >= firstsu && secondsu >= thirdsu){
            imsi = firstsu;
            firstsu = secondsu;
            secondsu = imsi;
        }
        else if(thirdsu >= firstsu && thirdsu >= secondsu){
            imsi = firstsu;
            firstsu = thirdsu;
            thirdsu = imsi;
        }
        
        if(thirdsu >= secondsu){
            imsi = secondsu;
            secondsu = thirdsu;
            thirdsu = imsi;
        }
        
        System.out.println();
        System.out.println(firstsu + ">=" + secondsu + ">=" + thirdsu);
    }
}