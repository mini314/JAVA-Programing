/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round04_examples;

/**
 *
 * @author mini
 */
import java.io.*;
public class Round04_HW2 {
    public static void main(String[] ar) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("이름 = ");
        String name = in.readLine();
        System.out.print("국어 = ");
        int korean = Integer.parseInt(in.readLine());
        System.out.print("영어 = ");
        int english = Integer.parseInt(in.readLine());
        System.out.print("수학 = ");
        int math = Integer.parseInt(in.readLine());
        System.out.println(name + "님 !! 당신의 성적은 다음과 같습니다.");
        System.out.println("총점 : " + (korean+english+math) + "점");
        System.out.println("평균 : " + (korean+english+math)/3.0 + "점");
    }
}
