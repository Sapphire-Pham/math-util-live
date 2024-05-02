/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author ngocb
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long result = MathUtil.getFactorial(5);   //Hàm tính đi coi là mấy
        System.out.println("expected: 5! = 120; actual: " + result);
        //Kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì
        //expected value: 5! = 120
        //Mày/hàm ai đó viết khi chạy thực tế là mấy - actual, giả sử 120
        //if expected value = actual, hàm ngon trong tình huống này

        //MathUtil.getFactorial(-5);
        
        System.out.println("expected: 6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("expected: 0! = 1; actual: " + MathUtil.getFactorial(0));
        
        
    }
    
}
