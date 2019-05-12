package hr.ferit.zeljkosabo.bmicalaculator.model

import kotlin.math.pow

object BodyMassIndex {
    var height: Double = 0.0
    var weight: Double = 0.0
    var bmi: Double = 0.0
    var isHeight: Boolean = false
    var isWeight: Boolean = false

    fun calculateBodyMassIndex() {
        bmi = weight / height.pow(2)
    }
}