package hr.ferit.zeljkosabo.bmicalaculator.ui

import android.content.Intent
import android.util.Log
import android.widget.Toast
import hr.ferit.zeljkosabo.bmicalaculator.R
import hr.ferit.zeljkosabo.bmicalaculator.model.BodyMassIndex
import hr.ferit.zeljkosabo.bmicalaculator.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun getLayoutId(): Int = R.layout.activity_main

    override fun setUpUi() {
        btn_calculate.setOnClickListener {
            navigateToCalculate()
        }
    }

    private fun navigateToCalculate() {
        getData()
        when {
            BodyMassIndex.isHeight && BodyMassIndex.isWeight -> {
                BodyMassIndex.calculateBodyMassIndex()
                val calculateBmiIntent = Intent(this, CalculateBMIActivity::class.java)
                startActivity(calculateBmiIntent)
            }
            else -> Toast.makeText(this, "Please enter height in meters and weight in kilograms", Toast.LENGTH_LONG)
        }
    }

    private fun getData() {
        when {
            et_height.text.isNotEmpty() && et_weight.text.isNotEmpty() -> {
                when {
                    et_height.text.toString().toDouble() > 0 && et_height.text.toString().toDouble() <= 2.5 && et_weight.text.toString().toDouble() > 0 && et_weight.text.toString().toDouble() <= 350 -> {
                        BodyMassIndex.height = et_height.text.toString().toDouble()
                        BodyMassIndex.weight = et_weight.text.toString().toDouble()
                        BodyMassIndex.isHeight = true
                        BodyMassIndex.isWeight = true
                    }
                    else -> {
                        BodyMassIndex.isHeight = false
                        BodyMassIndex.isWeight = false
                    }
                }
            }
            else -> {
                BodyMassIndex.isHeight = false
                BodyMassIndex.isWeight = false
            }
        }
    }
}
