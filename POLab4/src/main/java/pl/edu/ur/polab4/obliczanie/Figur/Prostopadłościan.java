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
public class Prostopadłościan {
    double bokA,bokB,bokC;
    
    public Prostopadłościan(double bokA, double bokB, double bokC){
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }
    public double poleProstpadłościanu(){
        double wynik;
        wynik = 2*(bokA*bokB + bokB*bokC + bokA*bokC);
        return wynik;              
    }
    public double objętośćProstopadłościanu(){
        double wynik;
        wynik = bokA*bokB*bokC;
        return wynik;
    }
    public void wyswietlanieProstopadłościanu(){
        System.out.println("Boki prostopadłościanu wynoszą: "+ bokA+", " +bokB +", " +bokC);
        System.out.println("Pole prostopadłościanu wynosi: "+ poleProstpadłościanu());
        System.out.println("Objętość prostopadłościanu wynosi: "+ objętośćProstopadłościanu());
    }
}
