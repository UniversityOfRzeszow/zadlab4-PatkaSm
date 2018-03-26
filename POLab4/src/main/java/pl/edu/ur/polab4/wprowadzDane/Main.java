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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int numer,x,y,i; 
       Student[] student = new Student[100];
        for (i = 0; i < student.length; i++) {
            student[i] = new Student("","",0,"",0);
        }
        do{
        System.out.println("Podaj numer działana które chcesz wykonać: \n 1. Wprowadzanie danych studenta pod wybrany index tablicy \n 2. Edycja (nadpisanie danych studenta) spod wybranego indeksu \n 3. usunięcie danych studenta (tj. Nadpisanie elementów tablicy wartościami domyślnymi) \n 4. Wyświetlenie obiektu o danym indeksie \n 5. Wyświetlenie wszystkich obiektów \n 6. Wyświetlenie zakresu obiektów w podanym zakresie. \n 7. Wyjście z menu");
        numer = in.nextInt();
        switch(numer){
            case 1: 
                System.out.println("Wybierz numer indexu tablicy: ");
                x = in.nextInt();
                student[x].wprowadzeneDanych(); break;
            case 2: 
                System.out.println("Wybierz numer indexu tablicy: ");
                x = in.nextInt();
                student[x].wprowadzeneDanych(); break;
            case 3: 
                System.out.println("Wybierz numer indexu tablicy: ");
                x = in.nextInt();
                student[x].domyślnie(); break;
            case 4:
                System.out.println("Wybierz numer indexu tablicy: ");
                x = in.nextInt();
                student[x].pokazDane(); break;
            case 5: 
                for (i = 0; i < 100; i++) {
                    student[i].pokazDane();       
                }  break;
            case 6:
                System.out.println("Podaj zakres indeksów do wyświetlenia: ");
                x = in.nextInt();
                y = in.nextInt();
                for(i=x; i<=y; i++){
                    student[i].pokazDane();
                }  break; 
            case 7: break;
        }
                
    }
    while(numer !=7);
    
}}
