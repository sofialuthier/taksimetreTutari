package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("gidilen yolu km cinsinden giriniz:" );
        Scanner input= new Scanner(System.in);
        int km= input.nextInt();
        double taksimetreTutari= (km*2.20)+10;
        boolean kosul= taksimetreTutari<20;
        double tutar= kosul? 20:taksimetreTutari;
        System.out.println("ödeyeceğiniz tutar: "+tutar);

    }
}
