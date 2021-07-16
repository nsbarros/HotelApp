package br.com.nsbarros.myhotelapp.entity

data class Hotel(
    var id: Int,
    val name: String,
    val address: String,
    val rating: Int,
    val price: Float
) {

    override fun toString(): String {
        return name
    }
}