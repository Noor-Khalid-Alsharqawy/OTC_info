package com.example.otcinfo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Surf_Fragment extends Fragment {

    public Surf_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_surf_, container, false);
        Toast.makeText(getActivity(),"This is SURF OTC section",Toast.LENGTH_SHORT).show();

        //a temporary product for completing the recycler view
        drug drug_panadolJoint= new drug("Panadol Joint",'A',3,1,"one or two pills");
        drug_panadolJoint.addActiveIngredient("paracetamol");
        drug_panadolJoint.setAge("minimally 12-year-olds.");
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
        //--
        drug drug_Otrivin= new drug("Otrivin",'C',3,1,"two or three drops into each nostril");
        drug_Otrivin.setAge("minimally 12-year-olds.");
        drug_Otrivin.addActiveIngredient("Xylometazoline hydrochloride");
        drug_Otrivin.addNote("Used for various types of colds.");
        drug_Otrivin.addNote("Should be only one week.");
        drug_Otrivin.addNote("Applied to well-cleaned nose. head should be slightly" +
                " tiled back during application. dropper should be cleaned after application.");
        drug_Otrivin.addNote("Should only be used according to doctor's directions in case of:" +
                "\n\t*Hypertension or Cardiovascular disease." +
                "\n\t*Hyperthyroidism.\n\t*Diabetes.\n\t*Pheochromocytoma.\n\t*Prostate hypertrophy");
        drug_Otrivin.addContraindication("After trans-sphenoidal hypophysectomy.");
        drug_Otrivin.addContraindication("After exposing the dura mater in any transnasal or " +
                "transbuccal surgical procedure.");
        drug_Otrivin.addContraindication("In case of rhinitis sicca, atrophic rhinitis, closed angle glaucoma.");
        drug_Otrivin.addContraindication("Sensitivity to any of the ingredients: xylometazoline, benzalkonium chloride" +
                ", disodium phosphate dodecahydrate, sodium dihydrogen phosphate dihydrate, disodium" +
                " edetate, sodium chloride, sorbitol, methylhydroxypropylcellulose.");
        drug_Otrivin.addInteraction("MAO inhibitors.");
        drug_Otrivin.addInteraction("Tricyclic antidepressants (or TCAs), like:\n\t*Clomipramine." +
                "\n\t*Amoxapine.\n\tetc.");
        drug_Otrivin.addInteraction("Tetracyclic antidepressants, like:\n\t*Ludiomil.\n\t*Remeron.\n\tetc.");
        drug_Otrivin.addSideEffect("Rhinitis and Congestion of nasal mucosa if overdosed.");
        drug_Otrivin.addSideEffect("Hypersensitivity reaction.");
        drug_Otrivin.addSideEffect("Headache."); drug_Otrivin.addSideEffect("Visual disturbance.");
        drug_Otrivin.addSideEffect("Hypersensitivity reaction."); drug_Otrivin.addSideEffect("Accelerated heart rate.");
        drug_Otrivin.addSideEffect("Hypertension."); drug_Otrivin.addSideEffect("Arrhythmias.");
        //to be continued
        ArrayList<drug> surf_ArrayList= new ArrayList<>();

        RecyclerView surf_RecyclerView= v.findViewById(R.id.rv2);
        surf_RecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager lm= new LinearLayoutManager(v.getContext());
        surf_RecyclerView.setLayoutManager(lm);

        SurfAdapter sf= new SurfAdapter(surf_ArrayList,v.getContext());
        surf_RecyclerView.setAdapter(sf);

        surf_ArrayList.add(drug_panadolJoint); surf_ArrayList.add(drug_Otrivin);
        return v;
    }
}