package com.kadiroz.kotlindersim.odev2

class Odev2 {

    //Parametre olarak girilen kenar sayısına göre toplam iç açıyı hesaplayan ve sonucu geri gönderen metod
    fun soru1(kenarSayisi: Int): Int {
        if (kenarSayisi <= 2) {
            println("İç açıları toplamı aşağıdadır, lakin $kenarSayisi kenarlı bir cokgen olamaz")
        }
        return (kenarSayisi - 2) * 180
    }



    //Girilen Gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod
    //1 gunde sabit sekilde 8 saat calisildigindan ve bunun degismemesinden dolayi farkli bir durum olusmasi mumkun degildir
    fun soru2(isGunu:Int) {
        val saatlikNormalCalisma = 40
        val saatlikMesaiCalisma = 80
        val gunlukCalisma = isGunu * 8
        var maas: Int

        if (gunlukCalisma <= 150) {
            maas = gunlukCalisma * saatlikNormalCalisma
        } else {
            maas = (6000 + ((gunlukCalisma - 150) * saatlikMesaiCalisma))
        }
        return println(maas)
    }


    // Otopark süresine göre otopark ücreti hesaplayarak geri döndüren metod
    fun soru3(saat:Int): Int {
        val saatlikUcret = 50
        val saatlikZamanAsimi = 10
        var toplamUcret: Int

        if (saat <= 1 ){
            toplamUcret = 50
        } else {
            toplamUcret = (50 + ((saat - 1) * saatlikZamanAsimi))
        }


        return toplamUcret
    }

    //Girilen km'yi mile donusturdukten sonra geri donduren bir metod yaziniz
    fun soru4(km:Double): Double{
        return km * 0.621
    }

    //Kenarlari girilen dikdortgenin alanini bulan metod yaziniz
    fun soru5(kisaKenar:Int,uzunKenar:Int) {
        println("Dikdortgenin alani ${kisaKenar*uzunKenar} m2'dir")
    }

    //Girilen sayinin faktoriyel degerini hesaplayip geri donduren metodu yaziniz
    fun soru6(sayi:Int): Long {
        var sonuc: Long = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    //Girilen kelime icerisinde kac adet e harfi oldugunu gosteren metod
    fun soru7(kelime:String){
        var count = 0
        for (i in kelime){
            if ( i == 'e' || i == 'E') {
                count++
            }
        }
        println(count)
    }
}