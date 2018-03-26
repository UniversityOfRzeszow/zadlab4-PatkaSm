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
public class Kula {
    double promien;
    
    public Kula(double promien){
        this.promien = promien;
    }
    
    public double poleKuli(){
        double wynik;
        wynik = 4*Math.PI*Math.pow(promien,2);
        return wynik;
    }
    public double objętośćKuli(){
        double wynik;
        wynik = (4/3)*Math.PI*Math.pow(promien, 3);
        return wynik;
    }
    public void wypisanieKula(){
        System.out.println("Promień kul wynosi: "+ promien);
        System.out.println("Pole kuli wynosi: "+poleKuli());
        System.out.println("Objętość kuli wynosi: "+objętośćKuli());
    }
    
}
