package com.kadiroz.kotlindersim.odev2


fun main() {
    val o2 = Odev2()

    //1. Soruda girilen parametre ile cokgenin ic acilar toplami goruntulendi
    println(o2.soru1(3))
    println(o2.soru1(2)) //2 ve kucuk degerlerde cokgen olmayacagi belirtildi

    //2. Soruda calisilan is gunune gore alinacak maas goruntulendi
    o2.soru2(19)
    o2.soru2(18)

    //3. Soruda otoparkta kalinan saate gore odenecek ucret goruntulendi
    println( o2.soru3(1))

    //4. Soruda girilen kilometreye gore mil hesabi yapildi
    println( o2.soru4(2.1))

    //5. Soruda dikdortgenin kenar olculeri istenerek alani bulundu
    o2.soru5(3,4)

    //6. Soruda faktoriyel hesabi yapildi
    println(o2.soru6(0))
    println(o2.soru6(8))

    //7. Soruda girilen keilmenin icerisinde bulunan 'e' harfinin sayisi bulundu f
    o2.soru7("Adana")
    o2.soru7("Edirne")

}