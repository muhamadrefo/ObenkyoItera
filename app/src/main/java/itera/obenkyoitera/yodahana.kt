package itera.obenkyoitera

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class yodahana : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yodahana)
    }
    fun goha(view: View) {
        startActivity(Intent(applicationContext, HiraganaActivity::class.java)) //gojoun
    }

    fun yoonha(view: View) {
        startActivity(Intent(applicationContext, yohana::class.java)) // yoon
    }

    fun goten(view: View) {
        startActivity(Intent(applicationContext, godahana::class.java)) // godakuten
    }
    fun home(view: View) {
        //startActivity(Intent(applicationContext, MainActivity::class.java)) // gojoun
        finish()
    }

}
