/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round06;

/**
 * 주민등록번호 8번째 자리를 입력받아 출생지를 알아보는 프로그램을 작성해 보자.
 * 0 : 서울/부산
 * 1 : 부산/인천/경기도
 * 2 : 경기도/강원도
 * 3 : 강원도/충청북도
 * 4 : 충청남도/전라북도
 * 5 : 전라북도/전라남도
 * 6 : 전라남도/경상남북도
 * 7 : 경상남북도
 * 8 : 경상남북도
 * 9 : 경상남북도
 * @author Home
 */
public class Round06_HW3 {
    public static void main(String[] ar) throws java.io.IOException{
        System.out.print("주민번호 8번째 자리를 입력하세요 : ");
        char n = (char)System.in.read();
        
        switch(n){
            case '0' : System.out.println("당신은 서울/부산 출생이시군요 ^^"); break;
            case '1' : System.out.println("당신은 부산/인천/경기도 출생이시군요 ^^"); break;
            case '2' : System.out.println("당신은 경기도/강원도 출생이시군요 ^^"); break;
            case '3' : System.out.println("당신은 강원도/충청북도 출생이시군요 ^^"); break;
            case '4' : System.out.println("당신은 충청남도/전라북도 출생이시군요 ^^"); break;
            case '5' : System.out.println("당신은 전라북도/전라남도 출생이시군요 ^^"); break;
            case '6' : System.out.println("당신은 전라남도/경상남북도 출생이시군요 ^^"); break;
            case '7' : case '8' : case '9' : System.out.println("당신은 경상남북도 출생이시군요 ^^"); break;
            default : System.out.println("숫자를 입력해 주세요.");
        }
    }
}
