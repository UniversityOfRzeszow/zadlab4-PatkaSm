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
public class Koło {
    double promien;
    
    public Koło(double promien){
        this.promien = promien;
    }
    
    public double poleKoła(){
        double wynik;
        wynik = Math.PI*Math.pow(promien,2);
        return wynik;
    }
    public double obwodKoła(){
        double wynik;
        wynik = 2*Math.PI*promien;
        return wynik;
    }
    public void wypisanieKoło(){
        System.out.println("Promień koła wynosi: "+ promien);
        System.out.println("Pole koła wynosi: "+poleKoła());
        System.out.println("Obwód koła wynosi: "+obwodKoła());
    }
    
}
