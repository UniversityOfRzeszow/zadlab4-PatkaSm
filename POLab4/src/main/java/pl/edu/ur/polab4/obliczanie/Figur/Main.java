package pl.edu.ur.polab4.obliczanie.Figur;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
        Scanner in = new Scanner(System.in);
        int numer;
        do{
        System.out.println("Wyberz numer figury: \n 1. Koło \n2. Kula \n 3.Kwadrat \n 4.Prostokąt \n 5. Prostopadłościan \n 6. Stożek \n 7. Sześcian \n 8. Wyjście z menu.");
        numer = in.nextInt();
        switch(numer){
            case 1: 
                System.out.println("Wpisz długość promienia: ");
                Koło koło1 = new Koło(in.nextDouble());
                koło1.wypisanieKoło(); break;
            case 2:
                System.out.println("Wpisz długość promienia: ");
                Kula kula1 = new Kula(in.nextDouble());
                kula1.wypisanieKula(); break;
            case 3:
                System.out.println("Wpisz długość boku kwadratu: ");
                Kwadrat kwadrat1 = new Kwadrat(in.nextDouble());
                kwadrat1.wypisanieKwadrat(); break;
            case 4:
                System.out.println("Wpisz długości boków prostokąta: ");
                Prostokąt prostokąt1 = new Prostokąt(in.nextDouble(), in.nextDouble());
                prostokąt1.wypisanieProstokąt(); break;
            case 5:
                System.out.println("Wpisz długości boków prostopadłościanu: ");
                Prostopadłościan prostopadłościan1 = new Prostopadłościan(in.nextDouble(), in.nextDouble(), in.nextDouble());
                prostopadłościan1.wyswietlanieProstopadłościanu(); break;
            case 6:
                System.out.println("Podaj długość promienia, tworzącej i wysokości stożka: ");
                Stożek stożek1 = new Stożek(in.nextDouble(), in.nextDouble(), in.nextDouble());
                stożek1.wyswietlanieStożka(); break; 
            case 7:
                System.out.println("Podaj długość boku sześcianu: ");
                Sześcian sześcian1 = new Sześcian(in.nextDouble());
                sześcian1.wypisanieSześcianu(); break;
            case 8: break;
                
        }
        
    }
    while (numer != 8);
}}
