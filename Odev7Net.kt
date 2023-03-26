package com.info.odev2

class Odev7Net {

    fun netHesap(GB:Int):Int{
        var ucret = 0

        if (GB > 50){
            val kota = GB-50
            ucret = 100 + kota*4

        }else{
            ucret = 100
        }
        return ucret
    }

}