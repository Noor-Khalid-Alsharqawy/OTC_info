package com.example.otcinfo;
import java.io.Serializable;
import java.util.*;

public class drug implements Serializable {
    private String tradeName;
    private ArrayList<String> activeIngredients;
    private String age;
    private ArrayList<String> sideEffects;
    private ArrayList<String> interactions;
    private ArrayList<String> contraindications;
    private char pregnancySafety;
    private String application;
    private int dosageN;
    private int dosageD;
    private String howMuchPerDose;
    private ArrayList<String> notes;

    public drug(String tradeName, char safety, int n, int d, String h){
        this.tradeName= tradeName;
        activeIngredients= new ArrayList<>();
        sideEffects= new ArrayList<>();
        interactions= new ArrayList<>();
        contraindications= new ArrayList<>();
        pregnancySafety=safety;
        dosageN= n;
        dosageD= d;
        notes= new ArrayList<>();
        if(h.length()==0||h==null) {
            if (n == 0 && d == 0) application = "Applied according to a medical advice.";
            else if (n > 0 && d == 1) application = "Applied " + n + " time(s) a day.";
            else if (n > 0 && d > 1) application = "taken " + n + " time(s) every " + d + " days.";
        }
        else{
            if(Character.isLetter(h.charAt(0)))
                howMuchPerDose=(h.charAt(0)+"").toUpperCase()+h.substring(1);
            if (n == 0 && d == 0) application = "Applied according to a medical advice.";
            else if (n > 0 && d == 1) application = howMuchPerDose+ ", "+ n+ " time(s) a day.";
            else if (n > 0 && d > 1) application = howMuchPerDose+ ", "+ n+ " time(s) every " + d + " days.";
        }
    }

    public drug() {
        this(null,'\u0000',0,0,null);
    }

    //trade name methods
    public String getTradeName() { return tradeName; }
    public void setTradeName(String tradeName) { this.tradeName = tradeName; }

    //active ingredients methods
    public void addActiveIngredient (String ingredient){
        activeIngredients.add(ingredient);
        Collections.sort(activeIngredients);
    }
    public void addActiveIngredients (ArrayList<String> ingredients){
        activeIngredients.addAll(ingredients);
        Collections.sort(activeIngredients);
    }
    public String activeIngredientsString (){
        if(activeIngredients.isEmpty()) return null;
        else {
            String s = "- "+activeIngredients.get(0);
            if (activeIngredients.size() > 1)
                for (int i = 1; i < activeIngredients.size(); i++)
                    s += ("\n- " + activeIngredients.get(i));
            return s;
        }
    }
    public ArrayList<String> getActiveIngredients() { return activeIngredients; }

    //age methods
    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }

    //side effects methods
    public void addSideEffect (String effect){ sideEffects.add(effect); }
    public void addSideEffects (ArrayList<String> effects){ sideEffects.addAll(effects); }
    public String sideEffectsString (){
        if(sideEffects.isEmpty()) return null;
        else {
            String s = "- "+sideEffects.get(0);
            if (sideEffects.size() > 1)
                for (int i = 1; i < sideEffects.size(); i++)
                    s += ("\n- " + sideEffects.get(i));
            return s;
        }
    }
    public ArrayList<String> getSideEffects() { return sideEffects; }

    //interactions method
    public void addInteraction (String interaction){ interactions.add(interaction); }
    public void addInteractions (ArrayList<String> interation_s){ interactions.addAll(interation_s); }
    public String interactionsString (){
        if(interactions.isEmpty()) return null;
        else {
            String s = "- "+interactions.get(0);
            if (interactions.size() > 1)
                for (int i = 1; i < interactions.size(); i++)
                    s += ("\n- "+interactions.get(i));
            return s;
        }
    }
    public ArrayList<String> getInteractions() { return interactions; }

    //contraindications methods
    public void addContraindication (String contraindication){ contraindications.add(contraindication); }
    public void addContraindications (ArrayList<String> contraindication_s){contraindications.addAll(contraindication_s);}
    public String contraindicationsString (){
        if(contraindications.isEmpty()) return null;
        else {
            String s = "- "+contraindications.get(0);
            if (contraindications.size() > 1)
                for (int i = 1; i < contraindications.size(); i++)
                    s += ("\n- "+ contraindications.get(i));
            return s;
        }
    }
    public ArrayList<String> getContraindications() { return contraindications; }

    //pregnancy safety methods
    public char getPregnancySafety() { return pregnancySafety; }
    public void setPregnancySafety(char pregnancySafety) { this.pregnancySafety = pregnancySafety; }

    //application methods
    public String getApplication() { return application; }
    public void setApplication(String application) { this.application = application; }

    //dosage methods
    public int getDosageN() { return dosageN; }
    public void setDosageN(int dosageN) { this.dosageN = dosageN; }
    public int getDosageD() { return dosageD; }
    public void setDosageD(int dosageD) { this.dosageD = dosageD; }

    //notes methods
    public void addNote (String note){ notes.add(note); }
    public void addNotes (ArrayList<String> note_s){notes.addAll(note_s);}
    public String notesString (){
        if(notes.isEmpty()) return null;
        else {
            String s = "- "+ notes.get(0);
            if (notes.size() > 1)
                for (int i = 1; i < notes.size(); i++)
                    s += ("\n- "+notes.get(i));
            return s;
        }
    }
    public ArrayList<String> getNotes() { return notes; }

    //how much per dosage methods
    public String getHowMuchPerDose() { return howMuchPerDose; }
    public void setHowMuchPerDose(String howMuchPerDose) { this.howMuchPerDose = howMuchPerDose; }
}
