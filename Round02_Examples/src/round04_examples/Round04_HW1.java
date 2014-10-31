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
public class Round04_HW1 {
    public static void main(String[] ar) throws java.io.IOException{
        System.out.print("키보드에서 아무거나 하나만 누르고 Enter 키를 누르세요 : ");
        int cord = System.in.read();
        System.out.println((char)cord + " = " + cord);
    }
}
