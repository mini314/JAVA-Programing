/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round08_examples;

/**
 * 주민등록번호 생성기를 만들어 보자.
 * @author mini
 */
import java.io.*;
public class Round08_HW1 {
    public static int getInt(String str) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(str);
        int imsi = Integer.parseInt(in.readLine());
        return imsi;
    }
    public static void main(String[] ar) throws IOException{
        int year = getInt("태어난 년 = ");
        int mon = getInt("태어난 월 = ");
        int day = getInt("태어난 일 = ");
        int home = getInt("태어난 지역(0:서울, 1:경기 인천, 2:부산, 3:강원도, 4:충청도, 5:전라도, 6:대구 광주, 7:경북 경남, 8:경남, 9:제주도) = ");
        int sex = getInt("성별(0:남성, 1:여성) = ");
        int[] jumin = new int[14];
        
        jumin[0] = (year%100)/10;
        jumin[1] = year%10;
        jumin[2] = mon/10;
        jumin[3] = mon%10;
        jumin[4] = day/10;
        jumin[5] = day%10;
        switch(year/100){
            case 18 : jumin[7] = (9+sex)%10; break;
            case 19 : jumin[7] = (1+sex)%10; break;
            case 20 : jumin[7] = (3+sex)%10; break;
        }
        jumin[8] = home;
        jumin[9] = 0;
        jumin[10] = 0;
        jumin[11] = 0;
        jumin[12] = 0;
        int hap = 0, cre = 2;
        float temp = 0.0f;
        for(int i = 0; i < jumin.length - 1; i++){
            if(i == 6){
                continue;
            }
            hap += jumin[i] * cre;
            cre++;
            if(cre == 10){
                cre = 2;
            }
        }
        temp = (int)(hap / 11.0f) * 11.0f + 11.0f - hap;
        jumin[13] = (int)(temp - (int)(temp / 10.0f) * 10.0f);
        System.out.print("생성된 주민번호 = ");
        for(int i = 0; i < jumin.length; i++){
            if(i == 6){
                System.out.print("-");
                continue;
            }
            System.out.print(jumin[i]);
        }
        System.out.println();
    }
}
