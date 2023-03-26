package com.info.odev2

class Odev3Faktoriyel() {

    fun fakHesap(sayi:Int):Int{
            var sonuc = 1

        for (i in 1..sayi){
            sonuc = sonuc*i
        }
        return sonuc
    }

}