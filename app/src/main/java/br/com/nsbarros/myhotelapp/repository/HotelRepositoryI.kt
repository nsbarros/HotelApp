package br.com.nsbarros.myhotelapp.repository

import br.com.nsbarros.myhotelapp.entity.Hotel

interface HotelRepositoryI {

    fun addHotel(hotel: Hotel)

    fun remove(hotel: Hotel)

    fun search(term: String, callback: (List<Hotel>?) -> Unit)

    fun searchByID(id: Int, callback: (List<Hotel>?) -> Unit)
}