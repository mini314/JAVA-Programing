/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round13_examples;

/**
 *
 * @author mini
 */
class A{
    private int x = 100;
    private int y = 200;
}
class B extends A{
    private int r = 300;
    public void disp(){
        System.out.println("x = " + super.x);
        System.out.println("y = " + super.y);
        System.out.println("r = " + this.r);
    }
}
public class Round13_Ex04 {
    public static void main(String[] ar){
        B bp = new B();
        bp.disp();
    }
}
