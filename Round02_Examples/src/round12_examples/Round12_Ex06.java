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
public class Round12_Ex06 {
    public static void main(String[] ar){
        final int x = 100;
        class Inner5{
            int y = 200;
            public void aaa(){
                System.out.println("x = " + x);
                System.out.println("y = " + y);
            }
        }
        Inner5 in = new Inner5();
        in.aaa();
    }
}
