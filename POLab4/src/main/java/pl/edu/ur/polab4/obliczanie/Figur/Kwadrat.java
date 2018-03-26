/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanie.Figur;

/**
 *
 * @author Patrycja
 */
public class Kwadrat {
     double bok;
    public Kwadrat(double bok){
        this.bok = bok;
    }
    public double poleKwadratu(){
        double wynik;
        wynik = bok*bok;
        return wynik;
    }
    public double obwódKwadratu(){
        double wynik;
        wynik = 4*bok;
        return wynik;         
    }
    public void wypisanieKwadrat(){
        System.out.println("Bok kwadratu wynosi: "+bok);
        System.out.println("Pole kwadratu wynosi: "+poleKwadratu());
        System.out.println("Obwód kwadartu wynosi: "+obwódKwadratu());
    }
}
