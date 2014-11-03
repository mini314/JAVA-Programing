/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round06;

/**
 * 앞서 배운 계산기 프로그램을 만들어서 한번 계산을 한 후 다시 계산을 할 것인지 물어 보고
 * 수행을 계속할 것인지를 결정하는 프로그램을 만들어 보자.
 * @author Home
 */
import java.io.*;
public class Round06_HW5 {
    public static void main(String[] ar) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int su1 = 0, su2 = 0, tot = 0;
        char yon = 0, q = 0;
        
        do{
            System.out.print("첫번째 수 = ");
            su1 = Integer.parseInt(in.readLine());
            System.out.print("연산자(+, -, *, /, %) = ");
            yon = (char)System.in.read();
            System.in.read();
            System.out.print("두번째 수 = ");
            su2 = Integer.parseInt(in.readLine());
        
            switch(yon){
            case '+' : tot = su1 + su2; break;
            case '-' : tot = su1 - su2; break;
            case '*' : tot = su1 * su2; break;
            case '/' : tot = su1 / su2; break;
            case '%' : tot = su1 % su2; break;
            default : System.out.println("잘못된 연산자 입력");
                System.exit(-1);
            }
        
            System.out.println();
            System.out.println(su1 + " " + yon + " " + su2 + " = " + tot);
          
            System.out.print("계속 하시겠습니까(y/n) ? ");
            q = (char)System.in.read();
            System.in.read();
        }while(q=='y');
    }
}
