package fr.epita.android.whatilike;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class DetailActivity extends Activity{

    int pos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);

        //Get Cell position
        Intent i = getIntent();
        pos = i.getExtras().getInt("Position");

        //Get View
        final TextView detailName = findViewById(R.id.detailName);

        //Set data
        detailName.setText("Vous avez cliquez sur la position:" + pos);

    }

}
