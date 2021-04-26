package com.example.otcinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class productDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        Bundle b= getIntent().getExtras();
        product item= (product) b.getSerializable("productItem");

        TextView nameText= findViewById(R.id.tv13); nameText.setText(item.getD().getTradeName());
        TextView price= findViewById(R.id.tv15); price.setText(item.getPrice()+"KD");
        TextView type= findViewById(R.id.tv17); type.setText(item.getType());
        TextView weight= findViewById(R.id.tv19); weight.setText(item.getTotalMGrams());
        TextView manufacturer= findViewById(R.id.tv21); manufacturer.setText(item.getManufacturer());
        TextView country= findViewById(R.id.tv23); country.setText(item.getCountry());
        TextView note= findViewById(R.id.tv25);
        if(item.getNotes().length()==0)note.setText("No notes for this product.");
        else note.setText(item.getNotes());
        ImageView image= findViewById(R.id.imageView6); image.setImageResource(item.getImage());

    }
}