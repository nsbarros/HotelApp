package br.com.nsbarros.myhotelapp.presenter

import br.com.nsbarros.myhotelapp.entity.Hotel
import br.com.nsbarros.myhotelapp.repository.HotelRepositoryI
import br.com.nsbarros.myhotelapp.ui.HotelListViewI

class HotelPresenter (private val view: HotelListViewI,
                      private val repository: HotelRepositoryI) {

    fun search(term: String){
        repository.search(term) { hotels ->
            showList(hotels)
        }
    }

    fun showList(list: List<Hotel>?){
        view.showListHotel(list)
    }

}