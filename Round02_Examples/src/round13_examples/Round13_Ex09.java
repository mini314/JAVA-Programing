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
class A4{
    int x = 100;
}
class B4 extends A4{
    int y = 200;
}
public class Round13_Ex09 {
    public static void main(String[] ar){
        A4 ap = new B4();
        System.out.println("x = " + ap.x);
        System.out.println("y = " + ap.y);
    }
}
