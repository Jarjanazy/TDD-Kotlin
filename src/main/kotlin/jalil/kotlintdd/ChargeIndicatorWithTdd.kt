package jalil.kotlintdd

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import jalil.ChargeDisplay
import java.io.File

class ChargeIndicatorWithTdd(private val chargeDisplay: ChargeDisplay) {


    fun displayChargeIndicatorFromPowerFile(powerDataFilePath: String) {
        val jsonString: String = File(powerDataFilePath).readText(Charsets.UTF_8)

        val status: Map<String, Double> = jacksonObjectMapper().readValue(jsonString)

        val currentAmperage = status.getValue("currentAmperage")
        val currentHz = status.getValue("currentHz")

        displayChargeIndicator(currentAmperage, currentHz)
    }

    private fun displayChargeIndicator(amperage: Double, hz: Double) {
        val charge = (((amperage * 4.5) + 1500) / hz ) * 100
        chargeDisplay.displayCharge(charge.toInt())
    }

}