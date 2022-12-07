package jalil.kotlintdd.notdd

import com.fasterxml.jackson.module.kotlin.*
import java.io.File

class ChargeIndicator {

    fun displayChargeIndicator() {
        val jsonString: String = File("/home/jalil/Desktop/status.json").readText(Charsets.UTF_8)

        val status: Map<String, Double> = jacksonObjectMapper().readValue(jsonString)

        val currentAmperage = status.getValue("currentAmperage")
        val currentHz = status.getValue("currentHz")

        val currentCharge = currentAmperage.times(4.5).plus(1500).div(currentHz).times(100)


    }


}