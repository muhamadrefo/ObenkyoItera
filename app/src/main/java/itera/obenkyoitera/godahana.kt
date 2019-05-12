package itera.obenkyoitera

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class godahana : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_godahana)
    }

    fun yohana(view: View) {
        startActivity(Intent(applicationContext, yodahana::class.java)) //yoondakuten
    }

    fun yoonha(view: View) {
        startActivity(Intent(applicationContext, yohana::class.java)) // yoon
    }

    fun goha(view: View) {
        startActivity(Intent(applicationContext, HiraganaActivity::class.java)) // gojoun
    }
    fun home(view: View) {
        startActivity(Intent(applicationContext, MainActivity::class.java)) // gojoun
    }

}
