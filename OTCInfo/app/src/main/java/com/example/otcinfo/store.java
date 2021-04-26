package com.example.otcinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;


public class store extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        //lacation icon
        ImageView location= findViewById(R.id.imageView2);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+Uri.encode("السالمية"));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        //phone icon
        ImageView call= findViewById(R.id.imageView3);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:66573159"));
                startActivity(callIntent);
            }
        });

        //a temporary product for completing the recycler view
        drug drug_panadolJoint= new drug("Panadol Joint",'A',3,1,"one or two pills");
        drug_panadolJoint.addActiveIngredient("paracetamol");
        drug_panadolJoint.setAge("minimally 12.");
        drug_panadolJoint.addNote("The effect of a dose lasts for 8 hours.");
        drug_panadolJoint.addNote("should be taken with water.");
        drug_panadolJoint.addNote("Used for reducing the mild and moderate pain caused by arthritis." +
                " It reduces mild and moderate pain caused by headache, migraine, period, sore throat," +
                "dental procedures, toothache and fever after vaccination.");
        drug_panadolJoint.addNote("Store below 30 Celcius degrees away from light and heat.");
        drug_panadolJoint.addNote("Take 2 tablets for each dose.");
        drug_panadolJoint.addContraindication("Sensitivity to paracetamol, hypromellose, starch, povidine" +
                ", magnesium stearate, croscarmellose sodium, stearic acid, glycerol triacetate, or " +
                "carnauba wax.");
        drug_panadolJoint.addContraindication("Kidney or liver impairment.");
        drug_panadolJoint.addContraindication("Glutathione depleted state.");
        drug_panadolJoint.addContraindication("Severe Infection.");
        drug_panadolJoint.addInteraction("Alcohol.");
        drug_panadolJoint.addInteraction("Anticoagulants.");
        drug_panadolJoint.addInteraction("Coumarins.");
        drug_panadolJoint.addSideEffect("Causes liver failure if overdosed.");

        product product_panadolJoint = new product(drug_panadolJoint, "Tablets",1.150,"900 mg",
                drug_panadolJoint.notesString(),R.drawable.panadol_joint);
        product_panadolJoint.setCountry("Australia");
        product_panadolJoint.setManufacturer("gsk GlaxoSmithKline");

        ArrayList<product> products_ArrayList= new ArrayList<>();
        products_ArrayList.add(product_panadolJoint);

        //recycler view
        RecyclerView products_RecyclerView= findViewById(R.id.rv);
        products_RecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager lm= new LinearLayoutManager(this);
        products_RecyclerView.setLayoutManager(lm);

        ProductsAdapter p= new ProductsAdapter(products_ArrayList, store.this);
        products_RecyclerView.setAdapter(p);


    }
}