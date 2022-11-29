
package com.bentuk;

import com.base.BangunDatar;

public class Persegi implements BangunDatar {
    int panjang;
    int lebar;

    public Persegi (int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar; 
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
}