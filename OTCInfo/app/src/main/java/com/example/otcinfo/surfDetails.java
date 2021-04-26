package com.example.otcinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class surfDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surf_details);

        Bundle b= getIntent().getExtras();
        drug item= (drug) b.getSerializable("surfItem");

        TextView nameText= findViewById(R.id.tv27); nameText.setText(item.getTradeName());
        TextView activeText= findViewById(R.id.tv29); activeText.setText(item.activeIngredientsString());
        TextView ageText= findViewById(R.id.tv31); ageText.setText(item.getAge());
        TextView sideText= findViewById(R.id.tv33); sideText.setText(item.sideEffectsString());
        TextView interText= findViewById(R.id.tv35); interText.setText(item.interactionsString());
        TextView contText= findViewById(R.id.tv37);  contText.setText(item.contraindicationsString());
        TextView appText= findViewById(R.id.tv39); appText.setText(item.getApplication());
        TextView noteText= findViewById(R.id.tv41); noteText.setText(item.notesString());
        TextView pregText= findViewById(R.id.tv43); pregText.setText(item.getPregnancySafety()+"");
    }
}