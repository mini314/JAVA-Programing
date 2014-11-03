/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round08_examples;

/**
 *
 * @author mini
 */
public class Round08_Ex02 {
   public static void main(String[] ar) {
       if(ar.length != 1){
           System.out.println("Usage : java Round08_02 숫자");
           System.exit(1);
       }
       int x = Integer.parseInt(ar[0]);
       System.out.println("입력된 수 = " + x);
   }
}
