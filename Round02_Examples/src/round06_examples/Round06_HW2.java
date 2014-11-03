/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round06;

/**
 * 연도를 입력받아 윤년인지 아닌지를 구별하는 프로그램을 작성해 보자.
 * @author Home
 */
import java.io.*;
public class Round06_HW2 {
    public static void main(String[] ar) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("연도를 입력하세요 : ");
        int year = Integer.parseInt(in.readLine());
        
        if(year%4 != 0 )
            System.out.println(year + "년은 윤년이 아닙니다.");
        else{
            if(year%100 != 0)
                System.out.println(year + "년은 윤년입니다.");
            else{
                if(year%400 !=0)
                    System.out.println(year + "년은 윤년이 아닙니다.");
                else
                    System.out.println(year + "년은 윤년입니다.");
            }
        }
    }
}
