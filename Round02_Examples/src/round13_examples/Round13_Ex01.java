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
class Inherit{
    
}
public class Round13_Ex01 extends Object {
    public static void main(String[] ar){
        Inherit in = new Inherit();
        System.out.println("두객체가 같니 ? " + in.equals(in));
        System.out.println("in객체의 클래스 이름은 ? " + in.getClass());
        System.out.println("in객체의 hashCode는 ? " + in.hashCode());
        System.out.println("in객체를 표현하는 기본 문자열은 ? " + in.toString());
        System.out.println("in객체를 표현하는 기본 문자열 약식은 ? " + in);
    }
}
