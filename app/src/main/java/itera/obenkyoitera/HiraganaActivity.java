package itera.obenkyoitera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HiraganaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiragana);
    }

    public void goten(View view) {
        startActivity(new Intent(getApplicationContext(), godahana.class));
    }

    public void yoonha(View view) {
        startActivity(new Intent(getApplicationContext(), yohana.class));
    }

    public void yohana(View view) {
        startActivity(new Intent(getApplicationContext(), yodahana.class));
    }
    public void home(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
