package br.com.nsbarros.myhotelapp.ui.fragments

import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment
import br.com.nsbarros.myhotelapp.entity.Hotel
import br.com.nsbarros.myhotelapp.presenter.HotelPresenter
import br.com.nsbarros.myhotelapp.repository.HotelRepository
import br.com.nsbarros.myhotelapp.ui.HotelListViewI

class HotelListFragment: ListFragment(), HotelListViewI {

    private val presenter = HotelPresenter(this, HotelRepository())

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        presenter.search("")

    }

    override fun showListHotel(hotels: List<Hotel>?) {
        listAdapter = ArrayAdapter<Hotel>(requireContext(), android.R.layout.simple_list_item_1,
            hotels!!
        )
    }

    override fun openDetails() {

    }

}

