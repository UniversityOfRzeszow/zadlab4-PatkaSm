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
public class Prostokąt {
    double bokA, bokB;
    public Prostokąt(double bokA, double bokB){
        this.bokA = bokA;
        this.bokB = bokB;
    }
    public double poleProstokąta(){
        double wynik;
        wynik = bokA*bokB;
        return wynik;
    }
    public double obwódProstokąta(){
        double wynik;
        wynik = 2*(bokA+bokB);
        return wynik;         
    }
    public void wypisanieProstokąt(){
        System.out.println("Boki prostokąta wynoszą: "+ bokA +", " +bokB);
        System.out.println("Pole prostokąta wynosi: "+poleProstokąta());
        System.out.println("Obwód prostokąta wynosi: "+obwódProstokąta());
    }
}
