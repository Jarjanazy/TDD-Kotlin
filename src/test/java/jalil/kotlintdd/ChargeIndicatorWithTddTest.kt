package jalil.kotlintdd

import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.Mockito.verify

class ChargeIndicatorWithTddTest {

    private val chargeDisplay = Mockito.mock(ChargeDisplay::class.java)
    private val chargeIndicator = ChargeIndicatorWithTdd(chargeDisplay)
    @Test
    fun givenAmperageIs1AndHzIs2000_WhenDisplayChargeMethodIsCalled_ThenShowChargeAs75() {
        chargeIndicator.displayChargeIndicator(1, 2000)

        verify(chargeDisplay).displayCharge(75)
    }

    @Test
    fun givenAmperageIs5AndHzIs2000_WhenDisplayChargeMethodIsCalled_ThenShowChargeAs76() {
        chargeIndicator.displayChargeIndicator(5, 2000)

        verify(chargeDisplay).displayCharge(76)
    }
}