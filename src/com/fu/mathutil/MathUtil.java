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
//Ta viết cái class để cung cấp tiện ích cho nơi khác xài
//Khi ta cung cấp tiện ích cho nơi khác xài, đó là lúc ta không cần nhớ cái gì cho riêng ta, hàm static giúp làm điều này
public class MathUtil {

    //n! = 1.2.3.4.5...n
    //0! = 1! = 1
    //Không tính giai thừa cho số âm
    //20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    //21! lố kiểu long rồi
    //Nếu đưa vào số âm hay > 21!, ta không tính, thông báo ngoại lệ: không tính được
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument. n must be between 0...20");
        //Hàm dừng liền không cần return
            
        //Xuống đến đây là n = 0...20
        if (n == 0 || n == 1)
            return 1;   //Dừng ngay khi n đặc biệt
        
        //Xuống đến đây là n = 0...20
        //Chơi for hoặc đệ quy - recursion
        //Kĩ thuật nhồi con heo đất, ốc bưu dồn thịt
        //i = 2, i = 3, i = 4, i = n nhồi liên tục i vào tích
        long product = 1; //Tích khởi đầu bằng 1, nhồi 2, 3,...,n
        for (int i = 2; i <= n; i++) 
            product *= i;
        return  product;        
    }
}
