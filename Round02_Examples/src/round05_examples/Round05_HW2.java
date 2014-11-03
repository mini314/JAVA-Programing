/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round05;

/**
 * 순자 하나를 입력받아 그 수가 1이면 "남성",
 * 2이면 "여성"이라는 글자를 출력하는 프로그램을 만들어 보자.
 * @author Home
 */
public class Round05_HW2 {
    public static void main(String[] ar) throws java.io.IOException {
        System.out.print("성별을 입력하세요. (남성:1, 여성:2):");
        char sex = (char)System.in.read();
        System.out.println("당신은 " + (sex == '1' ? "남성" : "여성") + "입니다.");
    }
}
