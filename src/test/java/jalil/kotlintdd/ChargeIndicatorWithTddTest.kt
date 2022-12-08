package jalil.kotlintdd

import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.Mockito.verify

class ChargeIndicatorWithTddTest {

    private val chargeDisplay = Mockito.mock(ChargeDisplay::class.java)
    private val chargeIndicator = ChargeIndicatorWithTdd(chargeDisplay)
    @Test
    fun givenAmperageIs1AndHzIs2000_WhenDisplayChargeMethodIsCalled_ThenShowChargeAs75() {
        val powerDataFilePath = this::class.java.getResource("/1amp2000hz.json")?.path

        chargeIndicator.displayChargeIndicatorFromPowerFile(powerDataFilePath!!)

        verify(chargeDisplay).displayCharge(75)
    }

    @Test
    fun givenAmperageIs5AndHzIs2000_WhenDisplayChargeMethodIsCalled_ThenShowChargeAs76() {
        val powerDataFilePath = this::class.java.getResource("/5amp2000hz.json")?.path

        chargeIndicator.displayChargeIndicatorFromPowerFile(powerDataFilePath!!)

        verify(chargeDisplay).displayCharge(76)
    }
}