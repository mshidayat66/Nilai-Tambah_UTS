package com.hitung;

import com.bentuk.*;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();

        Lingkaran lingsatu = new Lingkaran(x,y);
        Persegi persegisatu = new Persegi(x,y);

        HitungArsir pertama = new HitungArsir(lingsatu, persegisatu);
        pertama.tampilkanHasil();

        sc.close();
    }
}