/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round07_examples;

/**
 *
 * @author mini
 */
import java.io.*;
public class Round07_Ex04 {
    public static String getString(String str) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(str + " = ");
        String imsi = in.readLine();
        return imsi;
    }
    public static void main(String[] ar) throws IOException{
        String name = getString("이름");
        System.out.println(name + "님! 안녕하세요!!");
    }
}
