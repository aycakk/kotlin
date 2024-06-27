package com.example.android.odev2

class Odev2 {
    fun kmtomil(km: Double): Double {
        val mil = km * 0.621
        return mil
    }

    fun alan(kisakenar: Double, uzunkenar: Double): Double {
        val alan = kisakenar * uzunkenar
        return alan
    }

    fun foktoriyel(sayi: Int): Int {

        var toplam = 1
        var number = sayi
        while (number > 0) {
            toplam = toplam * number
            number = -1
        }

        return toplam
    }

    fun esayaci() {
        var kelime = "sevecen"
        var sayac = 0
        for (c in kelime) {
            if (c == 'e') {
                sayac = +1
            }
        }

    }

    fun icacı(kenarsayisi: Int): Int {
        var icaci = ((kenarsayisi - 2) * 180) / kenarsayisi
        return icaci

    }

    fun maas(gun: Int): Int {
        var calısmasaati = gun * 8
        var maas: Int
        if (calısmasaati > 150) {
            maas = ((calısmasaati - 150) * 80) + (40 * 150)
        } else {
            maas = calısmasaati * 40
        }
        return maas
    }

    fun otopark(saat: Int): Int {
        var ucret: Int
        if (saat == 1) {
            ucret = 50
        } else {
            ucret = 50 + (saat - 1) * 10
        }
        return ucret
    }


}