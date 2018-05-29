package com.mrangle.hogomogo;

import java.io.Serializable;

public class Pet implements Serializable
{
    /*
        te atrybuty okreslone maja scisle okreslone kryteria. Okreslanie ich polega
        na zaznaczeniu odpowiednich "checkbox'ów"
     */
    /*
        TODO: dodac Enum/stale okreslajace mozliwe wybory.
            : Enumu dla kazdego typu pozwolilyby na latwa zamiane z typu int na String
            : ( ulatwiloby to na tworzenie zapytan do serwera)
     */

    public enum Gatunek
    {
        Pies, Kot, Inne, BrakInformacji;
    }
    public enum DlugoscSiersci
    {
        Dlugie, Srednie, Krotkie, Brak, BrakInformacji;
    }
    public enum ZapotrzebowanieNaAktywnosc
    {
        Wysoka, Srednia, Niska, BrakInformacji;
    }
    public enum Ruchliwosc
    {
        Wysoka, Srednia, Niska, BrakInformacji;
    }
    public enum NastawienieDoCzlowieka
    {
        Przyjazne, Obojetne, Agresywne, BrakInformacji;
    }
    public enum NastawienieDoDzieci
    {
        Przyjazne, Obojetne, Agresywne, BrakInformacji;
    }
    public enum NastawienieDoInnychZwierzat
    {
        Przyjazne, Obojetne, Agresywne, BrakInformacji;
    }
    public enum SklonnosciDoNiszczenia
    {
        Wysoka, Srednia, Niska, BrakInformacji;
    }
    public enum StopienUczulania
    {
        Wysoki, Sredni, Niski, Brak, BrakInformacji;
    }
    public int id;
    public Gatunek gatunek;
    public DlugoscSiersci dlugoscSiersci;
    public NastawienieDoCzlowieka nastawienieDoCzlowieka;
    public NastawienieDoDzieci nastawienieDoDzieci;
    public NastawienieDoInnychZwierzat nastawienieDoInnychZwierzat;
    public StopienUczulania stopienUczulania;
    public ZapotrzebowanieNaAktywnosc zapotrzebowanieNaAktywnosc;
    public Ruchliwosc ruchliwosc;
    public SklonnosciDoNiszczenia sklonnosciDoNiszczenia;
    //public int wielkosc;



    /*
     * ponizsze atrybuty to ogolny opis stworzony przez wstawiajacego ogloszenie.
     */
    private String opis;
    private String chorobyOrazProblemy;
    private String imie;
    private int miesiecznyKosztUtrzymania;
    private int wiek;
    private int waga;

    public Pet()
    {
        id                          = -1;
        gatunek                     = Gatunek.BrakInformacji;
        dlugoscSiersci              = DlugoscSiersci.BrakInformacji;
        nastawienieDoCzlowieka      = NastawienieDoCzlowieka.BrakInformacji;
        nastawienieDoDzieci         = NastawienieDoDzieci.BrakInformacji;
        nastawienieDoInnychZwierzat = NastawienieDoInnychZwierzat.BrakInformacji;
        stopienUczulania            = StopienUczulania.BrakInformacji;
        zapotrzebowanieNaAktywnosc  = ZapotrzebowanieNaAktywnosc.BrakInformacji;
        ruchliwosc                  = Ruchliwosc.BrakInformacji;
        sklonnosciDoNiszczenia      = SklonnosciDoNiszczenia.BrakInformacji;
        opis                        = "";
        chorobyOrazProblemy         = "";
        imie                        = "";
        miesiecznyKosztUtrzymania   = -1;
        wiek                        = -1;
        waga                        = -1;
    }


    public String getImie()
    {
        return imie;
    }
    public void setImie(String imie)
    {
        this.imie = imie;
    }


    public int getWiek()
    {
        return wiek;
    }
    public void setWiek(int wiek)
    {
        this.wiek = wiek;
    }



    public int getWaga()
    {
        return waga;
    }
    public void setWaga(int waga)
    {
        this.waga = waga;
    }



    public int getMiesiecznyKosztUtrzymania()
    {
        return miesiecznyKosztUtrzymania;
    }
    public void setMiesiecznyKosztUtrzymania(int miesiecznyKosztUtrzymania)
    {
        this.miesiecznyKosztUtrzymania = miesiecznyKosztUtrzymania;
    }



    public String getOpis()
    {
        return opis;
    }
    public void setOpis(String opis)
    {
        this.opis = opis;
    }


    public String getChorobyOrazProblemy()
    {
        return chorobyOrazProblemy;
    }
    public void setChorobyOrazProblemy(String chorobyOrazProblemy)
    {
        this.chorobyOrazProblemy = chorobyOrazProblemy;
    }
}
