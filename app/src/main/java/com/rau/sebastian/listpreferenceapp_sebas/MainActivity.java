package com.rau.sebastian.listpreferenceapp_sebas;

import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ftinc.scoop.Scoop;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Scoop.waffleCone()
                .addFlavor("Default", R.style.Theme_Scoop, true)
                .addFlavor("Light", R.style.Theme_Scoop_Light)
                .addDayNightFlavor("DayNight", R.style.Theme_Scoop_DayNight)
                .addFlavor("Alternate 1", R.style.Theme_Scoop_Alt1)
                .setSharedPreferences(PreferenceManager.getDefaultSharedPreferences(this))
                .initialize();

        Scoop.getInstance().apply(this);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void tema2(View view){
        Scoop.waffleCone().addFlavor("Default", R.style.AppTheme2, true)
                .addFlavor("Alternate 1", R.style.AppTheme)
                .setSharedPreferences(PreferenceManager.getDefaultSharedPreferences(this))
                .initialize();

    }

}
