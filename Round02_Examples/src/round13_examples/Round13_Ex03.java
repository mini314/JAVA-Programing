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
class UpperClass{
    int x;
    int y;
    public UpperClass(){
        x = 10;
        y = 20;
    }
    public UpperClass(int x){
        this();
        this.x = x;
    }
    public UpperClass(int x, int y){
        this(x);
        this.y = y;
    }
}
class LowerClass extends UpperClass{
    int r;
    public LowerClass(){
        super();
        r = 30;
    }
    public LowerClass(int x){
        super(x);
        r = 30;
    }
    public LowerClass(int x, int y){
        super(x,y);
        r = 30;
    }
    public LowerClass(int x, int y, int r){
        this(x,y);
        this.r = r;
    }
}
public class Round13_Ex03 {
    public static void main(String[] ar){
        
    }
}
