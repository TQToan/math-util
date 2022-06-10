/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toantq.mathutil.test.core;

import com.toantq.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thai Quoc Toan <toantqse151272@fpt.edu.vn>
 */
public class MathUtilTest {
    
    // đây là class sẽ xử dụng các hàm của thư viện JUnit hay là framework 
    // để kiểm tra code chính - hàm tính giai thừa
    // bên core.MathUtil
    // viết code để test code chính bên kia!!
    
    //có nhiều quy tắc đặt tên hàm kiểm thử 
    // nhưng thường sẽ là nói lên mục đích của các case/ tính huống kiểm thử
    // tình huống xài hàm theo kiểu thành công và thất bại
    
    //hàm dưới đây là tình huống test chạy thành công, trả về ngon
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test chính là public static void main()
    //có nhiều @Test ứng với nhiều case khác nhau để kiểm thử (hàm tính giai thừa)
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; //test thử tình huống tử tế đầu vào => kết quả well
        long expected = 1; // kết quả expected = 1
        long actual = MathUtil.getFactorial(n); // gọi hàm để chạy code chính
        
        //so sánh expected vs. actual dùng framework (xanh, đỏ)
        assertEquals(expected, actual);
        //hàm này giúp so sánh 2 giá trị nào đó có giống nhau không 
        // nếu giống thì thảy ra màu xanh => code ngon cho cái case đang test
        // nếu không giống thì thảy ra màu đỏ => expected # actual 
        
        
        
        // gộp thêm cài case thành công/ đưa đầu vào ngon
        assertEquals(1, MathUtil.getFactorial(1)); // 1!=1
        assertEquals(2, MathUtil.getFactorial(2));// 2! = 2
        assertEquals(6, MathUtil.getFactorial(3));// 3! = 6
        assertEquals(24, MathUtil.getFactorial(4));// 4! = 24
        assertEquals(120, MathUtil.getFactorial(5));// 5! = 120
        assertEquals(720, MathUtil.getFactorial(6));// 6! = 720
        
        
    }
    
    //hàm getF() ta thiết kế có 2 tình huống xử lí
    //1. đưa data tử tế trong [0..20] -> tình huống đúng được n! - done
    //2. đưa data vào cà chớn, âm, > 20; thiết kế của hàm phải ném ra ngoại lệ
    // kì vọng ngoài lệ xuất hiện khi n < 0 || n > 20
    //rất mong ngoại lệ xuất hiện với n cà chớn
    
    //nếu hàm nhận vào n < 0 hoặc n > 20 thì hàm ném ra ngoại lệ 
    // => hàm test chạy đúng như thiết kế - màu xanh phải xuất hiện
    
    //nếu hàm nhận vào n < 0 || n > 20 và hàm không ném ra ngoại lệ
    // => hàm test chạy sai thiết kế, sai kì vọng => màu đỏ phải xuất hiện
    
    //Test case: 
    //Input: -5
    //expected: IllegalArgumentException xuất hiện
    //tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu
    // là những thứ không thể đo lường so sánh theo kiểu value
    // mà chỉ có thể đo lường = cách chúng có xuất hiện hay không
    //assertEquals() không thể dùng để so sánh 2 ngoại lệ
    //             là bằng nhau hay không trên value.
    
    
    //màu đỏ do hàm có ném ngoại lệ nhưng không phải là ngoại lệ như kì vọng
    // chứ không phải hàm ném sai
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFactorial(-5); // hàm @Test này chạy sẽ phải ném về ngoại lệ
//    }
    
    
    //màu đỏ do hàm này bị ERROR do không có truyền kì vọng
//    @Test
//    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        MathUtil.getFactorial(-5); // hàm @Test này chạy sẽ phải ném về ngoại lệ
//    }
    
    
    //màu xanh do hàm này bắt đúng exception đã kì vọng 
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5); // hàm @Test này chạy sẽ phải ném về ngoại lệ
    }
    
    //cách khác để bắt ngoại lệ xuất hiện
    //lamda expression: 
    //  - chỉ xảy ra khi chơi inheritance/interface
    //  - chỉ xảy ra khi chơi với interface mà chỉ có duy nhất 1 hàm abstract
    //    interface chỉ có duy nhất 1 hàm abstract/ hàm không có code thì được gọi là 
    //    functional interface
    
    //test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21
    //cần thấy màu xanh khi nhập vào 21!
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVerSion() {
       
        //MathUtil.getFactorial(-5); // hàm @Test này chạy sẽ phải ném về ngoại lệ
        //Assert.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-21));
    }
    
    //bắt ngoại lệ, xem hàm có ném về ngaoij lệ hay không khi n không hợp lệ
    // có ném, tức là hàm chạy đúng thiết kế -> xanh
    
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        //chủ động kiểm soát ngoại lệ
        try {
            MathUtil.getFactorial(-5); // hàm @Test này chạy sẽ phải ném về ngoại lệ
        } catch (Exception e) {
            //bắt try catch là Junit sẽ ra màu xanh do đã chủ động kiểm soát ngoại lệ
            // nhưng không chắc ngoại lệ mình cần có xuất hiện hay không 
            // có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xuất hiện
            Assert.assertEquals("Invalid argument. n must be between 0..20", e.getMessage());
        }
        
    }
    
    
}
