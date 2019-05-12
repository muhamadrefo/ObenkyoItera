package itera.obenkyoitera

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class godakana : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_godakana)
    }
    fun yokana(view: View) {
        startActivity(Intent(applicationContext, yodakana::class.java)) //yoondakuten
    }

    fun yoonka(view: View) {
        startActivity(Intent(applicationContext, yokana::class.java)) // yoon
    }

    fun goka(view: View) {
        startActivity(Intent(applicationContext, KatakanaActivity::class.java)) // gojoun
    }
    fun home(view: View) {
        startActivity(Intent(applicationContext, MainActivity::class.java)) // gojoun
    }

}
