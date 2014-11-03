/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round06;

/**
 * 연도와 월을 입력받아 달력을 출력하는 프로그램을 작성해 보자.
 * @author Home
 */
import java.io.*;
public class Round06_HW6 {
    public static void main(String[] ar) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("1. 년도를 4자리로 입력하세요(예 : 2004) => ");
        int year = Integer.parseInt(in.readLine());
        boolean yun = true;
        if(year%4 != 0 )
            yun = false;
        else{
            if(year%100 != 0)
                yun = true;
            else{
                if(year%400 !=0)
                    yun = false;
                else
                    yun = true;
            }
        }
        System.out.print("2. 월을 입력하세요(예 : 6) => ");
        int mon = Integer.parseInt(in.readLine());
        int day = 0;
        if(mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12)
            day = 31;
        else if(mon != 2)
            day = 30;
        else{
            if(yun)
                day = 29;
            else
                day = 28;
        }
        
        int days = 0;
        
        for(int i=1;i<year;i++){
            if(i%4 != 0 )
                days += 365%7;
            else{
                if(i%100 != 0)
                    days += 366%7;
                else{
                    if(i%400 !=0)
                        days += 365%7;
                    else
                        days += 366%7;
                }
            }
        }
        
        switch(mon){
            case 12 : days += 30%7;
            case 11 : days += 31%7;
            case 10 : days += 30%7;
            case 9 : days += 31%7;
            case 8 : days += 31%7;
            case 7 : days += 30%7;
            case 6 : days += 31%7;
            case 5 : days += 30%7;
            case 4 : days += 31%7;
            case 3 :
                if(yun)
                    days += 29%7;
                else
                    days += 28%7;
            case 2 : days += 31%7;
        }
        days %= 7;
        System.out.printf("================ ( %d년 %2d월 ) ================\n",year,mon);
        System.out.printf("%s%6s%6s%6s%6s%6s%6s\n","일","월","화","수","목","금","토");
        for(int i=0;i<days;i++){
            if(i==0)
                System.out.printf("%2s"," ");
            else
                System.out.printf("%7s"," ");
        }
        for(int i=1;i<=day;i++){
            if((days+i)%7 == 1)
                System.out.printf("%2d",i);
            else
                System.out.printf("%7d",i);
            if((days+i)%7 == 0)
                System.out.println();
        }
        System.out.println();
        System.out.println("=================================================");
    }
}
