package io.kamara.fenples

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

interface PlaceService {
    fun findPlaces(): List<Place>

    fun post(place: Place)
}

@Service
class PlaceServiceImpl(val db: PlaceRepository): PlaceService {
    override fun findPlaces(): List<Place> = db.findPlaces()


    override fun post(place: Place) {
        db.save(place)
    }

}

interface PlaceRepository : CrudRepository<Place, String>{
    @Query(value = "select * from places")
    fun findPlaces(): List<Place>
}
