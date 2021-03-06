package com.example.cinelaser

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var totalToPay = 0
    private var cont = 0

    fun addSeatToTotalToPay(rows: Int, seats: Int) {
        val valueSeat = calculateProfit(rows, seats)
        totalToPay += valueSeat
        cont++
    }

    fun removeSeatOfTotalToPay(rows: Int, seats: Int) {
        val valueSeat = calculateProfit(rows, seats)
        totalToPay -= valueSeat
        cont--
    }

    fun canProceedToPay(): Boolean {
        return totalToPay > 0
    }

    fun getTotalFormatted(): String {
        return "Total a pagar: R$ $totalToPay"
    }
    fun getNumberTickets(): Int{
        return cont
    }

    private fun calculateProfit(rows: Int, seats: Int): Int {
        val totalSeats = rows * seats
        val totalInCome = if (totalSeats < 60) {
            totalSeats * 10
        } else {
            val totalFontHalfSeats = rows / 2
            val totalBackHalfSeats = rows - totalFontHalfSeats

            ((totalFontHalfSeats * 10) + (totalBackHalfSeats * 8)) * seats
        }

        return totalInCome
    }


}