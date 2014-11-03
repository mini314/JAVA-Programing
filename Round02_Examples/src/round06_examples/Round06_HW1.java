/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round06;

/**
 * 문자 하나를 입력받아 대문자인지 소문자인지 구별하는 프로그램을 작성해 보자.
 * @author Home
 */
import java.io.*;
public class Round06_HW1 {
    public static void main(String[] ar) throws IOException{
        System.out.print("문자를 입력하세요 : ");
        char alphabet = (char)System.in.read();
        if('a'<=alphabet && alphabet<='z')
            System.out.println(alphabet + "는 소문자 입니다.");
        else if('A'<=alphabet && alphabet<='Z')
            System.out.println(alphabet + "는 대문자 입니다.");
        else
            System.out.println("알파벳을 입력해 주세요.");
    }
}
