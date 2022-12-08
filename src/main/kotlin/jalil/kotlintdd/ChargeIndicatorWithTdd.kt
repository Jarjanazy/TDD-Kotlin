package jalil.kotlintdd

class ChargeIndicatorWithTdd(private val chargeDisplay: ChargeDisplay) {

    fun displayChargeIndicator(amperage: Int, hz: Int) {
        val charge = (((amperage * 4.5) + 1500) / hz ) * 100
        chargeDisplay.displayCharge(charge.toInt())
    }
}