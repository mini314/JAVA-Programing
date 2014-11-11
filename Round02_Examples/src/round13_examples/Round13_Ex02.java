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
class Inherit2{
    public String toString(){
        return "클래스 Inherit";
    }
}
public class Round13_Ex02 {
    public static void main(String[] ar){
        Inherit2 in = new Inherit2();
        System.out.println("객체 출력 = " + in);
    }
}
