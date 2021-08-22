package com.mauriciobenigno.criptoconverter.data.model

import java.util.*

enum class Coin(val locale: Locale) {
    USD(Locale.US),
    BRL(Locale("pt", "BR")),
    BTC(Locale.US),
    LTC(Locale.US),
    ETH(Locale.US),
    XRP(Locale.US),
    DOGE(Locale.US),
    ;

    companion object {
        fun getByName(name: String) = values().find { it.name == name } ?: BRL
    }
}