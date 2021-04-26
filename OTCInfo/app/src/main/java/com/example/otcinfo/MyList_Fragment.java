package com.example.otcinfo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MyList_Fragment extends Fragment {
    //private drug d;

    public MyList_Fragment() {
        // Required empty public constructor
    }

    //@Override
    //public void onCreate(@Nullable Bundle savedInstanceState) {
        //super.onCreate(savedInstanceState);
        //Bundle b= getArguments();
        //if(b!=null){
            //d= (drug) b.getSerializable("toMine");
        //}
    //}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_my_list_, container, false);
        Toast.makeText(getActivity(),"This is My OTC LIST",Toast.LENGTH_SHORT).show();
        ArrayList<drug> myList_ArrayList= new ArrayList<>();

        //if(!myList_ArrayList.contains(d))
            //myList_ArrayList.add(d);

        RecyclerView myList_RecyclerView= v.findViewById(R.id.rv3);
        myList_RecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager lm= new LinearLayoutManager(v.getContext());
        myList_RecyclerView.setLayoutManager(lm);

        MyListAdapter mla= new MyListAdapter(myList_ArrayList,v.getContext());
        myList_RecyclerView.setAdapter(mla);

        return v;
    }
}