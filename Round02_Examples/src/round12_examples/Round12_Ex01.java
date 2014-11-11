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
class Outer{
    private int x = 100;
    public void aaa(){
            System.out.println("x = " + x);
            Outer.Inner in = this.new Inner();
            System.out.println("y = " + in.y);
    }
    class Inner{
        private int y = 200;    
    }
}
public class Round12_Ex01 {
    public static void main(String[] ar){
        Outer ot = new Outer();
        ot.aaa();
    }
}
