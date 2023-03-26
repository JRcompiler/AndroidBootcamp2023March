package com.info.odev2

class Odev4Adet {

    fun adet(kelime:String,harf:Char){
        var sonuc = 0

        for (i in kelime){

            if (i == harf){
                sonuc+=1
            }
        }
        println("Adet:$sonuc")
    }

}