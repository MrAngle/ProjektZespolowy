package com.mrangle.hogomogo.Activity;

import android.annotation.SuppressLint;
import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.mrangle.hogomogo.MyDialogFragment;
import com.mrangle.hogomogo.Pet;
import com.mrangle.hogomogo.R;

public class activity_show_advertisement extends AppCompatActivity {

    Pet pet;
    private DialogFragment messagebox = new MyDialogFragment();

    TextView textImie;
    TextView textWiek;
    TextView textGatunek;
    TextView textDlugoscSiersci;
    TextView textZapotrzebowanieNaAktywnosc;
    TextView textRuchliwosc;
    TextView textNastawienieDoCzlowieka;
    TextView textNastawienieDoDzieci;
    TextView textNastawienieDoInnychZwierzat;
    TextView textSklonnosciDoNiszczenia;
    TextView textStopenUczulania;
    TextView textKoszt;
    TextView textChoroby;
    TextView textOpis;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_advertisement);

        pet = (Pet) getIntent().getSerializableExtra("Pet");


        textImie                        = findViewById(R.id.petImie);
        textWiek                        = findViewById(R.id.petWiek);
        textGatunek                     = findViewById(R.id.petGatunek);
        textDlugoscSiersci              = findViewById(R.id.petDlugoscSiersci);
        textZapotrzebowanieNaAktywnosc  = findViewById(R.id.petAktywnosc);
        textRuchliwosc                  = findViewById(R.id.petRuchliwosc);
        textNastawienieDoCzlowieka      = findViewById(R.id.petNastawienieDoCzlowieka);
        textNastawienieDoDzieci         = findViewById(R.id.petNastawienieDoDzieci);
        textNastawienieDoInnychZwierzat = findViewById(R.id.petNastawienieDoInnychZwierzat);
        textSklonnosciDoNiszczenia      = findViewById(R.id.petSlonnoscDoNiszczenia);
        textStopenUczulania             = findViewById(R.id.petStopienUczulania);
        textKoszt                       = findViewById(R.id.petKoszt);
        textChoroby                     = findViewById(R.id.petChoroby);
        textOpis                        = findViewById(R.id.petOpis);






        getInformationAboutPet();




    }

    @SuppressLint("SetTextI18n")
    public void getInformationAboutPet()
    {
        textImie                        .setText(pet.getImie());
        textWiek                        .setText(pet.getWiek() + "");
        textGatunek                     .setText(pet.gatunek.toString());
        textDlugoscSiersci              .setText(pet.dlugoscSiersci.toString());
        textZapotrzebowanieNaAktywnosc  .setText(pet.zapotrzebowanieNaAktywnosc.toString());
        textRuchliwosc                  .setText(pet.ruchliwosc.toString());
        textNastawienieDoCzlowieka      .setText(pet.nastawienieDoCzlowieka.toString());
        textNastawienieDoDzieci         .setText(pet.nastawienieDoDzieci.toString());
        textNastawienieDoInnychZwierzat .setText(pet.nastawienieDoInnychZwierzat.toString());
        textSklonnosciDoNiszczenia      .setText(pet.sklonnosciDoNiszczenia.toString());
        textStopenUczulania             .setText(pet.stopienUczulania.toString());
        textKoszt                       .setText(pet.getMiesiecznyKosztUtrzymania() + "");
        textChoroby                     .setText(pet.getChorobyOrazProblemy());
        textOpis                        .setText(pet.getOpis());
    }

    public void clickGotowe(View v)
    {
        setContentView(R.layout.activity_menu);
        finish();
    }

        //messagebox.show(this.getFragmentManager(), pet.getChorobyOrazProblemy());



}
