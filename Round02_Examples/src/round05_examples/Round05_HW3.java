/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round05;

/**
 * 문자 하나를 입력받아 그 문자가 산술 연산자인지 아닌지를
 * 판단하는 프로그램을 만들어보자.
 * @author Home
 */
public class Round05_HW3 {
    public static void main(String[] ar) throws java.io.IOException{
        System.out.print("산술 연산자를 입력하세요. ('+', '-', '*', '/', '%'):");
        char op = (char)System.in.read();
        System.out.println("'"+op+"'는 산술 연산자" + ((op-'+')*(op-'-')*(op-'*')*(op-'/')*(op-'%')==0 ? "입니다." : "가 아닙니다."));
    }
}
