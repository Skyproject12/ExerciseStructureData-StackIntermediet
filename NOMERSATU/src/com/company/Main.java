package com.company;
import java.util.*;
public class Main {




    public static void main(String[] args) {
        link salah=new link (5);
        link benar=new link (5);
        Scanner scan = new Scanner(System.in);
        int a;
        int rand;
        int change=5;
        int answere=0;
        boolean jawaban = true;
        link<tebak> mh = new link<>(5);
        do {
        System.out.println("Peraturan");
        System.out.println("1. angka beerhasil di tebak akan di push ke stack correct ");
        System.out.println("2. stack miss berisi dari angka random yang gagal di tebak ");
        System.out.println("3. setelah lima angka sudah di tebak angka yang berhasil di tebak akan mendapatkan poinnya ");
        System.out.println("4. poin untuk setiap angka yang berhasil di tebak adalah sepuluh poin");
        System.out.println("5. jangkauan angka random adalah 1-5");
        System.out.println("pada akhir kesempatan semua angka pada miss dan right akan di pop hingga habis ");
        System.out.println("enter 2 kali to play ");
        scan.nextLine();
        jawaban=true;

            do {
                GenerateNumber gen = new GenerateNumber();
                rand = gen.getGen() + 1;
                System.out.println("Sisa Kesempatan :" + change);
                System.out.println("tebak angka :");
                a = scan.nextInt();
                jawaban=true;
                if (a == rand) {
                    benar.push(a);


                }
                if (a != rand) {

                    salah.push(a);
                }
                change--;

            } while (change != 0);
            System.out.println("======================");
            System.out.println("Angka yang berhasil di tebak ");
            benar.viewtampil();
            System.out.println("Angka yang tidak berhasil  ");
            salah.viewtampil();
            int point = benar.size * 10;
            System.out.println("poin" + point);
            System.out.println("\n====================");
            System.out.println("main lagi ? Y/N");
             answere = scan.next().charAt(0);
            if (answere == ('Y')) {
                change = change + 5;
                benar.delete();
                salah.delete();
                jawaban=true;
            } else if (answere == ('n')) {
                System.exit(0);
                jawaban=false;
            } else {
                System.exit(0);
            }

        }while(answere==('y'));
    }


}
