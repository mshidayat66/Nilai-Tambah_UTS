
package com.bentuk;

import com.base.BangunDatar;

public class Lingkaran implements BangunDatar {
    
    int panjang;
    int lebar;
    double PI;

    public Lingkaran (int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        PI = Math.PI;
    }

    @Override
    public void tampilluas(){
        
    }

    @Override
    public int panjang() {
        return this.panjang;
    }

    @Override
    public int lebar() {
        return this.lebar;
    }

    @Override
    public int luas(){
        return panjang * lebar;
    }

    public double getPI(){
        return PI;
    }
    
}