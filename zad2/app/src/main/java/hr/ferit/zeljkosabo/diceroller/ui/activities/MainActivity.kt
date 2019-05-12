package hr.ferit.zeljkosabo.diceroller.ui.activities

import android.widget.ImageView
import androidx.core.content.ContextCompat
import hr.ferit.zeljkosabo.diceroller.R
import hr.ferit.zeljkosabo.diceroller.model.Dice
import hr.ferit.zeljkosabo.diceroller.ui.activities.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    var dices: Array<Dice> = arrayOf(Dice(), Dice(), Dice(), Dice(), Dice(), Dice())
    override fun getLayoutResourceId() = R.layout.activity_main

    override fun setUpUi() {

        btn_rollDice.setOnClickListener {
            var dOne = Dice()
            var dTwo = Dice()
            var dThree = Dice()
            var dFour = Dice()
            var dFive = Dice()
            var dSix = Dice()

            dOne.throwDice()
            setUpPic(dOne, ic_dice01)
            dTwo.throwDice()
            setUpPic(dTwo, ic_dice02)
            dThree.throwDice()
            setUpPic(dThree, ic_dice03)
            dFour.throwDice()
            setUpPic(dFour, ic_dice04)
            dFive.throwDice()
            setUpPic(dFive, ic_dice05)
            dSix.throwDice()
            setUpPic(dSix, ic_dice06)
        }
    }

    private fun setUpPic(dice: Dice, diceId: ImageView) {
        when(dice.throwCounter){
            0 -> {
                when{
                    !dice.isFrozen && dice.diceValue == 1 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice1))
                    !dice.isFrozen && dice.diceValue == 2 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice2))
                    !dice.isFrozen && dice.diceValue == 3 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice3))
                    !dice.isFrozen && dice.diceValue == 4 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice4))
                    !dice.isFrozen && dice.diceValue == 5 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice5))
                    else -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice6))
                }
            }

            1 -> {
                if (dice.isFrozen){
                    when{
                        !dice.isFrozen && dice.diceValue == 1 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice1selected))
                        !dice.isFrozen && dice.diceValue == 2 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice2selected))
                        !dice.isFrozen && dice.diceValue == 3 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice3selected))
                        !dice.isFrozen && dice.diceValue == 4 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice4selected))
                        !dice.isFrozen && dice.diceValue == 5 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice5selected))
                        else -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice6selected))
                    }
                }else{
                    when{
                        !dice.isFrozen && dice.diceValue == 1 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice1))
                        !dice.isFrozen && dice.diceValue == 2 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice2))
                        !dice.isFrozen && dice.diceValue == 3 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice3))
                        !dice.isFrozen && dice.diceValue == 4 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice4))
                        !dice.isFrozen && dice.diceValue == 5 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice5))
                        else -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice6))
                    }
                }
            }
            else -> {
                when{
                    !dice.isFrozen && dice.diceValue == 1 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice1))
                    !dice.isFrozen && dice.diceValue == 2 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice2))
                    !dice.isFrozen && dice.diceValue == 3 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice3))
                    !dice.isFrozen && dice.diceValue == 4 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice4))
                    !dice.isFrozen && dice.diceValue == 5 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice5))
                    else -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice6))
                }
            }
        }

//        when{
//            !dice.isFrozen && dice.diceValue == 1 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice1))
//            !dice.isFrozen && dice.diceValue == 2 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice2))
//            !dice.isFrozen && dice.diceValue == 3 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice3))
//            !dice.isFrozen && dice.diceValue == 4 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice4))
//            !dice.isFrozen && dice.diceValue == 5 -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice5))
//            else -> diceId.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.dice6))
//        }
    }
}