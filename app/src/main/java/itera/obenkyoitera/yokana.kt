package itera.obenkyoitera

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class yokana : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yokana)
    }
    fun yokana(view: View) {
        startActivity(Intent(applicationContext, yodakana::class.java)) //yoondakuten
    }

    fun gohan(view: View) {
        startActivity(Intent(applicationContext, godakana::class.java)) // Gojoundakuten
    }

    fun goka(view: View) {
        startActivity(Intent(applicationContext, KatakanaActivity::class.java)) // gojoun
    }
    fun home(view: View) {
        //startActivity(Intent(applicationContext, MainActivity::class.java)) // gojoun
        finish()
    }

}
