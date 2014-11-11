/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round11_examples;

/**
 *
 * @author mini
 */
public class Round11_Ex01 {
    private int x;
    private int y;
    public Round11_Ex01(){
        x = 0;
        y = 0;
    }
    public Round11_Ex01(int a, int b){
        x = a;
        y = b;
    }
    public void disp(){
        System.out.println("x = " + x + ", y = "  + y);
    }
    
    public static void main(String[] ar){
        Round11_Ex01 rd = new Round11_Ex01(100,200);
        rd.disp();
    }
}
