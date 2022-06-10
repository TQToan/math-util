/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toantq.mathutil.core;

/**
 *
 * @author Thai Quoc Toan <toantqse151272@fpt.edu.vn>
 */
public class MathUtil {
    
    
    //trong class này cung cấp cho bên ngoài nhiều hàm xử lý toán học
    //clone class Math của JDK
    //hàm thư viện xài chung không cần lưu lại trạng thái/ giá trị
    //chọn thiết kế là hàm static
    
    // hàm tính giai thừa
    // n! = 1.2.3....n
    // không có giai thừa âm
    // 0! = 1! = 1
    // giai thừa tăng rất nhanh về giá trị
    // 20! là 18 số 0 = kiểu long trong java
    // 21! tràn kiểu 
    // bài này quy ước n! trong khoảng 0-20
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        
        return product;
    }
}
