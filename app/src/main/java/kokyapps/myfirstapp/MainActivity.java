package kokyapps.myfirstapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void onClickGermany(View view) {
        TextClock clock = findViewById(R.id.my_clock);
        clock.setTimeZone("Europe/Berlin");
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void onClickEgypt(View view) {
        TextClock clock = findViewById(R.id.my_clock);
        clock.setTimeZone("Africa/Cairo");
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public void onClickUSA(View view) {
        TextClock clock = findViewById(R.id.my_clock);
        clock.setTimeZone("America/New_York");
    }
}