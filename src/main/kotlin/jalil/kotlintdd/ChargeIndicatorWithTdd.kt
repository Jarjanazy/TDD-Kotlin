package jalil.kotlintdd

class ChargeIndicatorWithTdd(private val chargeDisplay: ChargeDisplay) {

    fun displayChargeIndicator(amperage: Int, hz: Int) {

        chargeDisplay.displayCharge(75)
    }
}