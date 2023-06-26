/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.jio.mathutil.core;

/**
 *
 * @author Jio
 */
// class này clone lại cái class huyền thoại java.util.Math
// với các hàm nổi tiếng Math.sqrt() Math.sin() Math.random()
// vs con số PI
public class MathUtility {

    public static final double PI = 3.1415;

    //class này chứa hàm static, chấm xài lun
    //tính n giai thừa n! = 1.2.3...n
    //quy ước thiết kế hàm này như sau
    //0! 1! = 1
    // ko có giai thừa số âm. nếu đưa số âm, chửi
    //giai thừa tăng nhanh, 20! vừa khớp full kiểu long
    // do đó 21! ko dùng kiểu long đc. Nếu đc >21 , chửi
    // chửi: ko trả về giá trị gì cả mà NÉM RA NGOẠI LỆ EXCEPTION
//    public static long getFactorial(int n) {
//        if (n > 20 || n < 0) {
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz!!!");
//        } else {
//            switch (n) {
//                case 0:
//                    return 1;
//                case 1:
//                    return 1;
//                default:
//                    return n * getFactorial(n - 1);
//            }
//        }
//    }
    public static long getFactorial(int n) {
        if (n > 20 || n < 0) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz!!!");
        } else {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * getFactorial(n - 1);

        }
    }
}

// 5! = 1.2.3.4.5 = 4! x 5 = 5 x 4!
// 4! = 4 x 3!
// 3! = 3 x 2!
// 2! = 2 x 1!
// 1! = 1 DỪNG LẠI HỒI NGƯỢC LÊN TRÊN
// N! = N X (N-1)!
//TDD : Test Driven Development phát triển p/m theo phong cách 
// code đến đâu kiểm thử đến đó, viết code và viết test case/test run
//diễn ra song song, đan xen
//cứ có hàm là test case
//viết ra các test case đủ bao quát các tình huống xài hàm
// test case: là bộ dữ liệu dùng để đưa vào app/hàm để mô phỏng lại
// 1 tình huống xài app/hàm. Nó có input data, giải thích cách dùng hàm/app
// và có giá trị trả về expected
//lát hồi run (test run/test execution) để luận đúng sai
// Dân DEV giống dân QC ở chỗ này:
// Đều phải viết/tạo ra TEST CASE, đều phải tiến hành RUN/ CHẠY TEST
// và đều phải đọc kết quả đúng sai
//DEV khác TESTER là phải viết CODE làm app!!!
////Test case ko viết tự do mà viết theo template 
// viết tự do: 0! -> 1; 1! -> 1; 2! -> 2; 3! -> 6; 5 -> 120
//Viết chuẩn lại test case ( xuất hiện trong đề thi PE, khóa luận Tốt Nghiệp VÀ 
// ĐI LÀM
// TEST CASE #1: ( mục tiêu test) check getF() with n = 0
// Steps - Procedures (cách tiến hành test - input/output...)
//          1. Given n = 0;
//          2. Call the getF(n) ( getF(1))
// Expected results: (kết quả kì vọng)
//              getF(1) must return 1
