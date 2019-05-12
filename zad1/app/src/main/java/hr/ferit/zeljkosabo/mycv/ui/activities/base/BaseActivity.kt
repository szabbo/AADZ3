package hr.ferit.zeljkosabo.mycv.ui.activities.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hr.ferit.zeljkosabo.mycv.R

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(getLayoutResourceId())
        setUpUi()
    }

    abstract fun getLayoutResourceId(): Int

    abstract fun setUpUi()
}
