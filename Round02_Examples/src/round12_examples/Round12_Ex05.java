/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round12_examples;

/**
 *
 * @author mini
 */
public class Round12_Ex05 {
    public static void main(String[] ar){
        int x = 100;
        class Inner4{
            int y = 200;
        }
        Inner4 in = new Inner4();
        System.out.println(x);
        System.out.println(in.y);
    }
}
