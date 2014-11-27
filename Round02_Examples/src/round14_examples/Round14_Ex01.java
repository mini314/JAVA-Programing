/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round14_examples;

/**
 *
 * @author mini
 */
interface A1{
    int w = 10;
    static int x = 20;
    final int y = 30;
    public static final int z = 40;
}
public class Round14_Ex01 {
    public static void main(String[] ar){
        //A1 ap = new A1();
        //A1.w = 100;
        System.out.println("w = " + A1.w);
        System.out.println("x = " + A1.x);
        System.out.println("y = " + A1.y);
        System.out.println("z = " + A1.z);
    }
}
