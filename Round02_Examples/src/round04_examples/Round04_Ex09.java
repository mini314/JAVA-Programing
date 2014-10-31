package round04_examples;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mini
 */
import java.io.*;
public class Round04_Ex09 {
    public static void main(String[] ar) throws java.io.IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String name = "";
        System.out.print("이름을 입력하세요 : ");
        name = in.readLine();
        System.out.println("당신이 입력하신 이름은 " + name + "입니다.");
    }
}
