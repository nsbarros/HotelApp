package br.com.nsbarros.myhotelapp.repository

import br.com.nsbarros.myhotelapp.entity.Hotel
import kotlin.random.Random

class HotelRepository : HotelRepositoryI {

    private var nextID: Int = 0
    private var listHotel = mutableListOf<Hotel>()

    init {
        listHotel.add(Hotel(0, "Hotel ${Random.nextInt()}", "Lorem ipsum", 1, 2.33F))
        listHotel.add(Hotel(0, "Hotel ${Random.nextInt()}", "Lorem ipsum", 2, 2.24F))
        listHotel.add(Hotel(0, "Hotel ${Random.nextInt()}", "Lorem ipsum", 3, 4.13F))
        listHotel.add(Hotel(0, "Hotel ${Random.nextInt()}", "Lorem ipsum", 4, 9.1F))
    }

    override fun addHotel(hotel: Hotel) {

        if (hotel.id == 0) {
            nextID++
            hotel.id = nextID
            listHotel.add(hotel)
        } else {
            if (!listHotel.contains(hotel)) {
                listHotel.add(hotel)
            }
        }
    }

    override fun remove(hotel: Hotel) {
        listHotel.remove(hotel)
    }

    override fun search(term: String, callback: (List<Hotel>?) -> Unit) {
        return callback(listHotel.filter { it.name.contains(term) })
    }

    override fun searchByID(id: Int, callback: (List<Hotel>?) -> Unit) {
        return callback(listHotel.filter { it.id == id })
    }

}