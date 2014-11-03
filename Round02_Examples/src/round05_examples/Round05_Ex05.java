/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round05;

/**
 *
 * @author Home
 */
public class Round05_Ex05 {
    public static boolean aaa(){
        System.out.println("AAA");
        return true;
    }
    public static boolean bbb(){
        System.out.println("BBB");
        return false;
    }
    public static void main(String[] ar){
        boolean b = aaa() | bbb();
        System.out.println("b = " + b);
    }
}
