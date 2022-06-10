/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toantq.mathutil.main;

import com.toantq.mathutil.core.MathUtil;


/**
 *
 * @author Thai Quoc Toan <toantqse151272@fpt.edu.vn>
 */
public class Main {
    public static void main(String[] args) {
        
        // thử nghiệm hàm tính giai thừa coii chạy đúng thiết kế hay không 
        // ta phải đưa các tính huống sử dụng hàm trong thực tế
        // ví dụ: đưa vào -5 , 0, 20, 21 (TEST CASE: tình huống test hàm, app, màn hình, tính năng được đưa vào sử dụng)
        // giải lập hành vi sai của ai đó
        
        //TEST CASE: là 1 tình huống sử dụng app, xài app/hàm mà nó bao gồm data đầu vào (cụ thể)
        // output đầu ra ứng với xử lí của hàm/chức năng. Dùng data đầu vào để xử lý.
        // so sánh kết quả có như kì vọng hay không. 
        // (kì vọng là mong hàm trả về value nào đó ứng với input ở trên)
        
        long expected = 120; // kì vong 120 = 5!
        int n = 5; // input (TEST CASE 1)
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " (expected)");
        System.out.println("5! = " + actual + " (actual)");
        
    }
}
