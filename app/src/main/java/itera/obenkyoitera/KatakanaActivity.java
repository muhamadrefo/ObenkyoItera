package itera.obenkyoitera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KatakanaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katakana);
    }

    public void gohan(View view) {
        startActivity(new Intent(getApplicationContext(), godakana.class));
    }
}
