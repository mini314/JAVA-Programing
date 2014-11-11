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
class A6{
    public void aaa(){
        System.out.println("aaa");
    }
    public void bbb(){
        System.out.println("bbb");
    }
}
class B6 extends A6{
    public void bbb(){
        System.out.println("bbb1");
    }
    public void ccc(){
        System.out.println("ccc");
    }
}
public class Round13_Ex11 {
    public static void main(String[] ar){
        A6 ap = new B6();
        ap.aaa();
        ap.bbb();
    }
}
