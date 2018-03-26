/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;

/**
 *
 * @author Patrycja
 */
public class Student {
    String imie;
    String nazwisko;
    int nr_indeksu;
    String specjalnosc;
    int rok_studiow;

    public Student(String imie, String nazwisko, int nr_indeksu, String specjalnosc, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.specjalnosc = specjalnosc;
        this.rok_studiow = rok_studiow;
    }

    Scanner in = new Scanner(System.in);

    public void domyślnie() {
        imie = "";
        nazwisko = "";
        nr_indeksu = 0;
        specjalnosc = "";
        rok_studiow = 0;
    }
    public void wprowadzeneDanych(){
        System.out.println("Wpisz imie: ");
        imie = in.nextLine();
        System.out.println("Wpisz nazwisko: ");
        nazwisko = in.nextLine();
        System.out.println("Wpisz numer indeksu: ");
        nr_indeksu = in.nextInt();
        System.out.println("Wpisz specjalność: ");
        specjalnosc = in.nextLine();
        System.out.println("Wpisz rok studiów: ");
        rok_studiow = in.nextInt();
    }
    
    public void pokazDane() {
        System.out.println("imię: " + imie);
        System.out.println("nazwisko: " + nazwisko);
        System.out.println("Numer indeksu: " + nr_indeksu);
        System.out.println("Specjalność: " + specjalnosc);
        System.out.println("Rok studiów: " + rok_studiow);
    }
    
}
