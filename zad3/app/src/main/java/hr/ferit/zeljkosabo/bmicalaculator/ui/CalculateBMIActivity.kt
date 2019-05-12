package hr.ferit.zeljkosabo.bmicalaculator.ui

import android.util.Log
import androidx.core.content.ContextCompat
import hr.ferit.zeljkosabo.bmicalaculator.R
import hr.ferit.zeljkosabo.bmicalaculator.model.BodyMassIndex
import hr.ferit.zeljkosabo.bmicalaculator.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_calculate_bmi.*

class CalculateBMIActivity : BaseActivity() {
    override fun getLayoutId(): Int = R.layout.activity_calculate_bmi

    override fun setUpUi() {
        tv_showBmi.text = BodyMassIndex.bmi.toString()
        setUpPic()
    }

    private fun setUpPic() {
        when {
            BodyMassIndex.bmi < 18.5 -> {
                tv_body_type.text = getText(R.string.text_underweight)
                tv_description.text = getText(R.string.underweight_text)

                iv_person.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.underweight
                    )
                )
            }
            BodyMassIndex.bmi < 25 -> {
                tv_body_type.text = getText(R.string.text_normal_weight)
                tv_description.text = getText(R.string.normal_weight_text)

                iv_person.setImageDrawable(
                    ContextCompat.getDrawable(
                        this,
                        R.drawable.normalweight
                    )
                )
            }
            BodyMassIndex.bmi < 30 -> {
                tv_body_type.text = getText(R.string.text_overweight)
                tv_description.text = getText(R.string.overweight_text)

                iv_person.setImageDrawable(
                    ContextCompat.getDrawable(
                        this, R.drawable.overweight
                    )
                )
            }

            else -> {
                tv_body_type.text = getText(R.string.text_obesity)
                tv_description.text = getText(R.string.text_obesity)

                iv_person.setImageDrawable(
                    ContextCompat.getDrawable(
                        this, R.drawable.obesity
                    )
                )
            }
        }
    }
}