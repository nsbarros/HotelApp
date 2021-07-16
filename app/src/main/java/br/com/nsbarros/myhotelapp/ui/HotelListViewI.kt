package br.com.nsbarros.myhotelapp.ui

import br.com.nsbarros.myhotelapp.entity.Hotel

interface HotelListViewI {

    fun showListHotel(hotels: List<Hotel>?)

    fun openDetails()

}