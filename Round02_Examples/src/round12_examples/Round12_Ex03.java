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
class Outer2{
    private int x = 100;
    static class Inner2{
        private int y = 200;
        public void aaa(){
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
public class Round12_Ex03 {
    public static void main(String[] ar){
        Outer2.Inner2 oi = new Outer2.Inner2();
        oi.aaa();
    }
}
