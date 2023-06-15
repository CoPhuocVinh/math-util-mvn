/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.jio.mathutil.core.test;

import static org.jio.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jio
 */
public class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArgumentReturnWell() {

        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));

    }

}

//DDT           là 1 phần mở rộng của các Unit Test Framwork
//DATA Driven Testing
//          Không nhầm vs TDD: Test Driven Development
                         //    viết code và viết Test Case Song hành
                         //    Vs nhau, đã học xong
//
//Nhưng CODE Test Bốc múi (BAD SMELLS) trùng code nhiều
// nên người ta chế ra cách viết đẹp hơn, gọn hơn, dễ bảo trì hơn
