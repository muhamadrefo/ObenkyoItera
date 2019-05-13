package itera.obenkyoitera

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class yodakana : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yodakana)
    }
    fun gohan(view: View) {
        startActivity(Intent(applicationContext, godakana::class.java)) //gojoundakuten
    }

    fun yoonka(view: View) {
        startActivity(Intent(applicationContext, yokana::class.java)) // yoon
    }

    fun goka(view: View) {
        startActivity(Intent(applicationContext, KatakanaActivity::class.java)) // gojoun
    }
    fun home(view: View) {
        //startActivity(Intent(applicationContext, MainActivity::class.java)) // gojoun
        finish()
    }

}
