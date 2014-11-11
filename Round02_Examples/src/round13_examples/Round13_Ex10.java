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
class A5{
    int x = 100;
}
class B5 extends A5{
    int x = 200;
}
public class Round13_Ex10 {
    public static void main(String[] ar){
        A5 ap = new B5();
        System.out.println("x = " + ap.x);
    }
}
