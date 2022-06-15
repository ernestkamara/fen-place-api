package io.kamara.fenples

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


@Table(value = "PLACES")
data class Place(
    @Id val id: String?,
    val name: String,
    val description: String?,
    val address: String,
    val city: String,
    val tlf: String?,
    val status: String,
    val plevel: Int,
    //val types: List<String>?,
    //val photos: List<String>?,
    //val openings: List<String>?
)