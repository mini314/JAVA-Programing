/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round09_examples;

/**
 *
 * @author mini
 */
import java.io.*;
public class Round09_Ex01 {
    private int[] sub;
    private float avg;
    public Round09_Ex01(){
        sub = new int[4];
        avg = 0.0f;
    }
    public void calc(){
        int tot = 0;
        for(int a = 0; a < sub.length;, a++){
            tot += sub[a];
        }
        avg = tot / sub.length;
    }
    public static class Round09_01_Inner{
        private String[] subname = {"국어", "영어", "수학"};
        public String getSubname(int x){
            return subname[x]
        }
    }
}
