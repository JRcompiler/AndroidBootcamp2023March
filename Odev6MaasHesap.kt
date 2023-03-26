package com.info.odev2

class Odev6MaasHesap {

    fun hesaplama(gunSayi:Int):Int{
        val calismaSaat = gunSayi * 8
        println("Saat:$calismaSaat")

        var maas = 0

        if (calismaSaat >160 ){
            val fazlaMesai = calismaSaat-160
            maas = 160*10 + fazlaMesai*20
        }else{
            maas = calismaSaat*10
        }
        return maas
    }

}