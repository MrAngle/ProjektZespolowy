package com.mrangle.hogomogo.Activity;

import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mrangle.hogomogo.MyDialogFragment;
import com.mrangle.hogomogo.Pet;
import com.mrangle.hogomogo.R;

public class CreateAdvertisement extends AppCompatActivity {

    public Button button;


    //Gatunek//
    private CheckBox checkPies;
    private CheckBox checkKot;
    private CheckBox checkInne;

    //Dlugosc siersci
    private CheckBox checkDlugie;
    private CheckBox checkSrednie;
    private CheckBox checkKrotkie;
    private CheckBox checkBrak;

    //Aktywnosc//
    private CheckBox checkAkWysoka;
    private CheckBox checkAkSrednia;
    private CheckBox checkAkNiska;

    //Ruchliwosc
    private CheckBox checkRuWysoka;
    private CheckBox checkRuSrednia;
    private CheckBox checkRuNiska;

    //Nastawienie do czlowieka
    private CheckBox checkCzPrzyjazne;
    private CheckBox checkCzObojetne;
    private CheckBox checkCzAgresywne;

    //Nastawienie do dzieci
    private CheckBox checkDzPrzyjazne;
    private CheckBox checkDzObojetne;
    private CheckBox checkDzAgresywne;

    //Nastawienie do innych zwierzat
    private CheckBox checkZwPrzyjazne;
    private CheckBox checkZwObojetne;
    private CheckBox checkZwAgresywne;

    //Slonnosc do niszczenia
    private CheckBox checkNiWysoka;
    private CheckBox checkNiSrednia;
    private CheckBox checkNiNiska;

    //stopien uczulania
    private CheckBox checkUczWysoki;
    private CheckBox checkUczSredni;
    private CheckBox checkUczNiski;

    private EditText ed_choroby;
    private EditText ed_opis;
    private EditText ed_imie;
    private EditText ed_wiek;
    private EditText ed_koszt;


    private DialogFragment messagebox = new MyDialogFragment();

    private Pet newPet;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_advertisement);
        newPet = new Pet();
        button = findViewById(R.id.buttonGotowe);

        //Gatunek//
        checkPies           = findViewById(R.id.checkPies);
        checkKot            = findViewById(R.id.checkKot);
        checkInne           = findViewById(R.id.checkInne);

        //Dlugosc siersci
        checkDlugie         =  findViewById(R.id.checkDlugie);
        checkSrednie        = findViewById(R.id.checkSrednie);
        checkKrotkie        = findViewById(R.id.checkKrotkie);
        checkBrak           =    findViewById(R.id.checkBrak);

        //Aktywnosc//
        checkAkWysoka       =  findViewById(R.id.checkAkWysoka);
        checkAkSrednia      =  findViewById(R.id.checkAkSrednia);
        checkAkNiska        =  findViewById(R.id.checkAkNiska);

        //Ruchliwosc
        checkRuWysoka       =  findViewById(R.id.checkRuWysoka);
        checkRuSrednia      =  findViewById(R.id.checkRuSrednia);
        checkRuNiska        =  findViewById(R.id.checkRuNiska);

        //Nastawienie do czlowieka
        checkCzPrzyjazne    =  findViewById(R.id.checkCzPrzyjazne);
        checkCzObojetne     =  findViewById(R.id.checkCzObojetne);
        checkCzAgresywne    =  findViewById(R.id.checkCzAgresywne);

        //Nastawienie do dzieci
        checkDzPrzyjazne    =  findViewById(R.id.checkDzPrzyjazne);
        checkDzObojetne     =  findViewById(R.id.checkDzObojetne);
        checkDzAgresywne    =  findViewById(R.id.checkDzAgresywne);

        //Nastawienie do innych zwierzat
        checkZwPrzyjazne    =  findViewById(R.id.checkZwPrzyjazne);
        checkZwObojetne     =  findViewById(R.id.checkZwObojetne);
        checkZwAgresywne    =  findViewById(R.id.checkZwAgresywne);

        //Slonnosc do niszczenia
        checkNiWysoka       = findViewById(R.id.checkNiWysoka);
        checkNiSrednia      = findViewById(R.id.checkNiSrednia);
        checkNiNiska        = findViewById(R.id.checkNiNiska);

        //stopien uczulania
        checkUczWysoki      = findViewById(R.id.checkUczWysoki);
        checkUczSredni      = findViewById(R.id.checkUczSredni);
        checkUczNiski       = findViewById(R.id.checkUczNiski);


        ed_choroby          = findViewById(R.id.editChoroby);
        ed_opis             = findViewById(R.id.editOpis);
        ed_imie             = findViewById(R.id.editImie);
        ed_wiek             = findViewById(R.id.editWiek);
        ed_koszt            = findViewById(R.id.editKoszt);
    }

    public void clickGotowe(View v)
    {
        if(!ed_choroby.getText().toString().matches(""))    newPet.setChorobyOrazProblemy(ed_choroby.getText().toString());
        if(!ed_opis.getText().toString().matches(""))       newPet.setOpis(ed_opis.getText().toString());
        if(!ed_imie.getText().toString().matches(""))       newPet.setImie(ed_imie.getText().toString());
        if(!ed_wiek.getText().toString().matches(""))       newPet.setWiek(Integer.parseInt(ed_wiek.getText().toString()));
        if(!ed_koszt.getText().toString().matches(""))      newPet.setMiesiecznyKosztUtrzymania(Integer.parseInt(ed_koszt.getText().toString()));

        Intent intent = new Intent(this, activity_show_advertisement.class).putExtra("Pet", newPet);

        startActivity(intent);

        finish();
    }

    //Gatunek//
    public void checkSetPies(View v)
    {
        if(!checkPies.isChecked())
            newPet.gatunek = Pet.Gatunek.BrakInformacji;
        else
            newPet.gatunek = Pet.Gatunek.Pies;
        checkKot.setChecked(false);
        checkInne.setChecked(false);
    }
    public void checkSetKot(View v)
    {
        if(!checkKot.isChecked())
            newPet.gatunek = Pet.Gatunek.BrakInformacji;
        else
            newPet.gatunek = Pet.Gatunek.Kot;
        checkPies.setChecked(false);
        checkInne.setChecked(false);
    }
    public void checkSetInne(View v)
    {
        if(!checkInne.isChecked())
            newPet.gatunek = Pet.Gatunek.BrakInformacji;
        else
            newPet.gatunek = Pet.Gatunek.Inne;
        checkPies.setChecked(false);
        checkKot.setChecked(false);
    }

    //Dlugosc siersci
    public void checkSetDlugie(View v)
    {
        if(!checkDlugie.isChecked())
            newPet.dlugoscSiersci = Pet.DlugoscSiersci.BrakInformacji;
        else
            newPet.dlugoscSiersci = Pet.DlugoscSiersci.Dlugie;

        checkSrednie.setChecked(false);
        checkKrotkie.setChecked(false);
        checkBrak.setChecked(false);
    }
    public void checkSetSrednie(View v)
    {
        if(!checkSrednie.isChecked())
            newPet.dlugoscSiersci = Pet.DlugoscSiersci.BrakInformacji;
        else
            newPet.dlugoscSiersci = Pet.DlugoscSiersci.Srednie;

        checkDlugie.setChecked(false);
        checkKrotkie.setChecked(false);
        checkBrak.setChecked(false);
    }
    public void checkSetKrotkie(View v)
    {
        if(!checkKrotkie.isChecked())
            newPet.dlugoscSiersci = Pet.DlugoscSiersci.BrakInformacji;
        else
            newPet.dlugoscSiersci = Pet.DlugoscSiersci.Krotkie;

        checkSrednie.setChecked(false);
        checkDlugie.setChecked(false);
        checkBrak.setChecked(false);
    }
    public void checkSetBrak(View v)
    {
        if(!checkBrak.isChecked())
            newPet.dlugoscSiersci = Pet.DlugoscSiersci.BrakInformacji;
        else
            newPet.dlugoscSiersci = Pet.DlugoscSiersci.Brak;

        checkSrednie.setChecked(false);
        checkDlugie.setChecked(false);
        checkKrotkie.setChecked(false);
    }

    //Aktywnosc//
    public void checkSetAkWysoka(View v)
    {
        if(!checkAkWysoka.isChecked())
            newPet.zapotrzebowanieNaAktywnosc = Pet.ZapotrzebowanieNaAktywnosc.BrakInformacji;
        else
            newPet.zapotrzebowanieNaAktywnosc = Pet.ZapotrzebowanieNaAktywnosc.Wysoka;
        checkAkSrednia.setChecked(false);
        checkAkNiska.setChecked(false);
    }
    public void checkSetAkSrednia(View v)
    {
        if(!checkAkSrednia.isChecked())
            newPet.zapotrzebowanieNaAktywnosc = Pet.ZapotrzebowanieNaAktywnosc.BrakInformacji;
        else
            newPet.zapotrzebowanieNaAktywnosc = Pet.ZapotrzebowanieNaAktywnosc.Srednia;
        checkAkWysoka.setChecked(false);
        checkAkNiska.setChecked(false);
    }
    public void checkSetAkNiska(View v)
    {
        if(!checkAkNiska.isChecked())
            newPet.zapotrzebowanieNaAktywnosc = Pet.ZapotrzebowanieNaAktywnosc.BrakInformacji;
        else
            newPet.zapotrzebowanieNaAktywnosc = Pet.ZapotrzebowanieNaAktywnosc.Niska;
        checkAkSrednia.setChecked(false);
        checkAkWysoka.setChecked(false);
    }

    //Ruchliwosc
    public void checkSetRuWysoka(View v)
    {
        if(!checkRuWysoka.isChecked())
            newPet.ruchliwosc = Pet.Ruchliwosc.BrakInformacji;
        else
            newPet.ruchliwosc = Pet.Ruchliwosc.Wysoka;
        checkRuSrednia.setChecked(false);
        checkRuNiska.setChecked(false);
    }
    public void checkSetRuSrednia(View v)
    {
        if(!checkRuSrednia.isChecked())
            newPet.ruchliwosc = Pet.Ruchliwosc.BrakInformacji;
        else
            newPet.ruchliwosc = Pet.Ruchliwosc.Srednia;
        checkRuWysoka.setChecked(false);
        checkRuNiska.setChecked(false);
    }
    public void checkSetRuNiska(View v)
    {
        if(!checkRuNiska.isChecked())
            newPet.ruchliwosc = Pet.Ruchliwosc.BrakInformacji;
        else
            newPet.ruchliwosc = Pet.Ruchliwosc.Niska;
        checkRuSrednia.setChecked(false);
        checkRuWysoka.setChecked(false);
    }

    //Nastawienie do czlowieka
    public void checkSetCzPrzyjazne(View v)
    {
        if(!checkCzPrzyjazne.isChecked())
            newPet.nastawienieDoCzlowieka = Pet.NastawienieDoCzlowieka.BrakInformacji;
        else
            newPet.nastawienieDoCzlowieka = Pet.NastawienieDoCzlowieka.Przyjazne;
        checkCzObojetne.setChecked(false);
        checkCzAgresywne.setChecked(false);
    }
    public void checkSetCzObojetne(View v)
    {
        if(!checkCzObojetne.isChecked())
            newPet.nastawienieDoCzlowieka = Pet.NastawienieDoCzlowieka.BrakInformacji;
        else
            newPet.nastawienieDoCzlowieka = Pet.NastawienieDoCzlowieka.Obojetne;
        checkCzPrzyjazne.setChecked(false);
        checkCzAgresywne.setChecked(false);
    }
    public void checkSetCzAgresywne(View v)
    {
        if(!checkCzAgresywne.isChecked())
            newPet.nastawienieDoCzlowieka = Pet.NastawienieDoCzlowieka.BrakInformacji;
        else
            newPet.nastawienieDoCzlowieka = Pet.NastawienieDoCzlowieka.Agresywne;
        checkCzObojetne.setChecked(false);
        checkCzPrzyjazne.setChecked(false);
    }

    //Nastawienie do dzieci
    public void checkSetDzPrzyjazne(View v)
    {
        if(!checkDzPrzyjazne.isChecked())
            newPet.nastawienieDoDzieci = Pet.NastawienieDoDzieci.BrakInformacji;
        else
            newPet.nastawienieDoDzieci = Pet.NastawienieDoDzieci.Przyjazne;
        checkDzObojetne.setChecked(false);
        checkDzAgresywne.setChecked(false);
    }
    public void checkSetDzObojetne(View v)
    {
        if(!checkDzObojetne.isChecked())
            newPet.nastawienieDoDzieci = Pet.NastawienieDoDzieci.BrakInformacji;
        else
            newPet.nastawienieDoDzieci = Pet.NastawienieDoDzieci.Obojetne;
        checkDzPrzyjazne.setChecked(false);
        checkDzAgresywne.setChecked(false);
    }
    public void checkSetDzAgresywne(View v)
    {
        if(!checkDzAgresywne.isChecked())
            newPet.nastawienieDoDzieci = Pet.NastawienieDoDzieci.BrakInformacji;
        else
            newPet.nastawienieDoDzieci = Pet.NastawienieDoDzieci.Agresywne;
        checkDzObojetne.setChecked(false);
        checkDzPrzyjazne.setChecked(false);
    }

    //Nastawienie do innych zwierzat
    public void checkSetZwPrzyjazne(View v)
    {
        if(!checkZwPrzyjazne.isChecked())
            newPet.nastawienieDoInnychZwierzat = Pet.NastawienieDoInnychZwierzat.BrakInformacji;
        else
            newPet.nastawienieDoInnychZwierzat = Pet.NastawienieDoInnychZwierzat.Przyjazne;
        checkZwObojetne.setChecked(false);
        checkZwAgresywne.setChecked(false);
    }
    public void checkSetZwObojetne(View v)
    {
        if(!checkZwObojetne.isChecked())
            newPet.nastawienieDoInnychZwierzat = Pet.NastawienieDoInnychZwierzat.BrakInformacji;
        else
            newPet.nastawienieDoInnychZwierzat = Pet.NastawienieDoInnychZwierzat.Obojetne;
        checkZwPrzyjazne.setChecked(false);
        checkZwAgresywne.setChecked(false);
    }
    public void checkSetZwAgresywne(View v)
    {
        if(!checkZwAgresywne.isChecked())
            newPet.nastawienieDoInnychZwierzat = Pet.NastawienieDoInnychZwierzat.BrakInformacji;
        else
            newPet.nastawienieDoInnychZwierzat = Pet.NastawienieDoInnychZwierzat.Agresywne;
        checkZwObojetne.setChecked(false);
        checkZwPrzyjazne.setChecked(false);
    }

    //Slonnosc do niszczenia
    public void checkSetNiWysoka(View v)
    {
        if(!checkNiWysoka.isChecked())
            newPet.sklonnosciDoNiszczenia = Pet.SklonnosciDoNiszczenia.BrakInformacji;
        else
            newPet.sklonnosciDoNiszczenia = Pet.SklonnosciDoNiszczenia.Wysoka;
        checkNiSrednia.setChecked(false);
        checkNiNiska.setChecked(false);
    }

    public void checkSetNiSrednia(View v)
    {
        if(!checkNiSrednia.isChecked())
            newPet.sklonnosciDoNiszczenia = Pet.SklonnosciDoNiszczenia.BrakInformacji;
        else
            newPet.sklonnosciDoNiszczenia = Pet.SklonnosciDoNiszczenia.Srednia;
        checkNiWysoka.setChecked(false);
        checkNiNiska.setChecked(false);
    }

    public void checkSetNiNiska(View v)
    {
        if(!checkNiNiska.isChecked())
            newPet.sklonnosciDoNiszczenia = Pet.SklonnosciDoNiszczenia.BrakInformacji;
        else
            newPet.sklonnosciDoNiszczenia = Pet.SklonnosciDoNiszczenia.Niska;
        checkNiSrednia.setChecked(false);
        checkNiWysoka.setChecked(false);
    }

    //stopien uczulania
    public void checkSetUczWysoki(View v)
    {
        if(!checkUczWysoki.isChecked())
            newPet.sklonnosciDoNiszczenia = Pet.SklonnosciDoNiszczenia.BrakInformacji;
        else
            newPet.sklonnosciDoNiszczenia = Pet.SklonnosciDoNiszczenia.Wysoka;
        checkUczSredni.setChecked(false);
        checkUczNiski.setChecked(false);
    }

    public void checkSetUczSredni(View v)
    {
        if(!checkUczSredni.isChecked())
            newPet.sklonnosciDoNiszczenia = Pet.SklonnosciDoNiszczenia.BrakInformacji;
        else
            newPet.sklonnosciDoNiszczenia = Pet.SklonnosciDoNiszczenia.Srednia;
        checkUczWysoki.setChecked(false);
        checkUczNiski.setChecked(false);
    }

    public void checkSetUczNiski(View v)
    {
        if(!checkUczNiski.isChecked())
            newPet.sklonnosciDoNiszczenia = Pet.SklonnosciDoNiszczenia.BrakInformacji;
        else
            newPet.sklonnosciDoNiszczenia = Pet.SklonnosciDoNiszczenia.Niska;
        checkUczSredni.setChecked(false);
        checkUczWysoki.setChecked(false);
    }



}
