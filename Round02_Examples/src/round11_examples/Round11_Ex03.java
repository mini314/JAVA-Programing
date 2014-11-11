/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round11_examples;

/**
 *
 * @author mini
 */
import java.io.*;
public class Round11_Ex03 {
    public static void main(String[] ar) throws IOException{
        Round11_Ex02 rd = new Round11_Ex02();
        System.out.println();
        System.out.print("총합은 ");
        System.out.println(Round11_Ex02.getTot());
        System.out.println();
        rd.display();
    }
}
