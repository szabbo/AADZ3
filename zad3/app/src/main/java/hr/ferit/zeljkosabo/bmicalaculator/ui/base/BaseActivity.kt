package hr.ferit.zeljkosabo.bmicalaculator.ui.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(getLayoutId())
        setUpUi()
    }

    abstract fun getLayoutId(): Int
    abstract fun setUpUi()
}
