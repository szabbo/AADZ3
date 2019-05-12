package hr.ferit.zeljkosabo.diceroller.model

import hr.ferit.zeljkosabo.diceroller.common.DiceActions
import kotlin.random.Random

class Dice : DiceActions {
    var diceValue: Int = 1
    var throwCounter = 0
    var isFrozen: Boolean = false

    override fun freezeDice() {
        when(throwCounter == 1){
            !this.isFrozen -> this.isFrozen = true
            else -> this.isFrozen = false
        }
    }

    override fun throwDice() {
        this.diceValue = Random.nextInt(1, 7)
        throwCounter++
    }
}