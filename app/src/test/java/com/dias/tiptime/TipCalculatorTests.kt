package com.dias.tiptime

import junit.framework.Assert.assertEquals
import org.junit.Test

class TipCalculatorTests {
    @Test
    fun `calculate 20 percent tip no roundup`() {
        val amount = 10.0
        val tipPercent = 20.0
        val expectedTip = "IDR2.00"
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }
}