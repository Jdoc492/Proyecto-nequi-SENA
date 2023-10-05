package com.jdocservices.nequi

import java.time.temporal.TemporalAmount

object AdministradorSaldo {
    private var saldo: Double = 100000.00

    fun ObtenerSaldo(): Double{
        return saldo
    }

    fun restarSaldo(amount: Double){
        saldo -= amount
    }
}