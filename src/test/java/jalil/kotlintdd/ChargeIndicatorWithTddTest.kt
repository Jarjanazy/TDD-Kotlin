package jalil.kotlintdd

import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.Mockito.verify

class ChargeIndicatorWithTddTest {

    @Test
    fun givenAmperageIs1AndHzIs2000_WhenDisplayChargeMethodIsCalled_ThenShowChargeAs75() {
        val chargeDisplay = Mockito.mock(ChargeDisplay::class.java)

        val chargeIndicator = ChargeIndicatorWithTdd(chargeDisplay)

        chargeIndicator.displayChargeIndicator(1, 2000)


        verify(chargeDisplay).displayCharge(75)
    }

}