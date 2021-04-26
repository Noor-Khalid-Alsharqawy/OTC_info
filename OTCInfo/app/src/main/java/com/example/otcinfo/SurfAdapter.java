package com.example.otcinfo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

public class SurfAdapter extends RecyclerView.Adapter {

    private ArrayList<drug> sArray;
    private Context context;

    public SurfAdapter(ArrayList<drug> sArray, Context context) {
        this.sArray = sArray;
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.surf_card, parent, false);
        ViewHolder vh= new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).tradeName.setText(sArray.get(position).getTradeName());
        StringBuilder sb1= new StringBuilder(sArray.get(position).getActiveIngredients().get(0));
        if(sArray.get(position).getActiveIngredients().size()!=1) {
            for (int i=1; i<sArray.get(position).getActiveIngredients().size(); i++){
                sb1.append("\n"+sArray.get(position).getActiveIngredients().get(i));
            }
        }
        ((ViewHolder) holder).activeIngredient.setText(sb1.toString());
        ((ViewHolder) holder).add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent i= new Intent(context,MyListAdapter.class);
                //i.putExtra("toLib",sArray.get(position));
                //context.startActivity(i);
            }
        });
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //write 'context' any where you need activity inside the adapter.
                Intent i= new Intent(context,surfDetails.class);
                i.putExtra("surfItem",sArray.get(position));
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() { return sArray.size(); }

    private static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView tradeName;
        public TextView activeIngredient;
        public Button add;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view= itemView;
            tradeName= itemView.findViewById(R.id.textView9);
            activeIngredient= itemView.findViewById(R.id.textView10);
            add= itemView.findViewById(R.id.button6);
        }
    }
}
