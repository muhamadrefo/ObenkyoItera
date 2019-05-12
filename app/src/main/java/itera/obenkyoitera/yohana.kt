package itera.obenkyoitera

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class yohana : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yohana)
    }

    fun yohana(view: View) {
        startActivity(Intent(applicationContext, yodahana::class.java)) //yoondakuten
    }

    fun goten(view: View) {
        startActivity(Intent(applicationContext, godahana::class.java)) // yoon
    }

    fun goha(view: View) {
        startActivity(Intent(applicationContext, HiraganaActivity::class.java)) // gojoun
    }

}

