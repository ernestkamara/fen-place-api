package io.kamara.fenples

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class FenPlaceApiApplication

fun main(args: Array<String>) {
    runApplication<FenPlaceApiApplication>(*args)
}

@RestController
@RequestMapping("/api/place")
class MessageResource(val service: PlaceServiceImpl) {
    @GetMapping
    fun index(): List<Place> = service.findPlaces()

    @GetMapping("/{slug}")
    fun findPlace(@PathVariable slug: String) = service.findPlace()

    @PostMapping
    fun post(@RequestBody place: Place) {
        service.post(place)
    }
}

/*
val lists = listOf(
    Place(
        id = "62988630ba0db9d27c560249",
        name = "Milton Mat",
        address = "7 Ronneta Drive",
        status = PlaceStatus.CLOSED_PERMANENTLY.name,
        city = City.FREETOWN.name,
        description = "",
        tlf = "076-889-666",
        openings = listOf(
            "Monday: 9:00 AM – 5:00 PM",
            "Tuesday: 9:00 AM – 5:00 PM",
            "Wednesday: 9:00 AM – 5:00 PM",
            "Thursday: 9:00 AM – 5:00 PM",
            "Friday: 9:00 AM – 10:00 PM",
            "Saturday: 10:00 AM – 12:00 PM",
            "Sunday: Closed"
        ),
        photos = listOf(
            "https://api.lorem.space/image/house?w=1500&h=1500",
            "https://api.lorem.space/image/house?w=1500&h=1500",
            "https://api.lorem.space/image/house?w=1500&h=1500",
            "https://api.lorem.space/image/house?w=1500&h=1500"
        ),
        plevel = PriceLevel.EXPENSIVE.value,
        types = listOf(PlaceType.ATM.name, PlaceType.ART_GALLERY.name)

    ),

    Place(
        id = "62988630ba0db9d27c560248",
        name = "Hello Mat",
        address = "7 Roeta Drive",
        status = PlaceStatus.CLOSED_PERMANENTLY.name,
        city = City.MAKALI.name,
        description = "",
        tlf = "076-889-666",
        photos = listOf(
            "https://api.lorem.space/image/house?w=1500&h=1500",
            "https://api.lorem.space/image/house?w=1500&h=1500",
            "https://api.lorem.space/image/house?w=1500&h=1500",
            "https://api.lorem.space/image/house?w=1500&h=1500"
        ),
        openings = null,
        plevel = PriceLevel.EXPENSIVE.value,
        types = listOf(PlaceType.ATM.name, PlaceType.ART_GALLERY.name)
    ),
    Place(
        id = "62988630ba0db9d27c560248",
        name = "Hello Mat",
        address = "7 Roeta Drive",
        status = PlaceStatus.CLOSED_PERMANENTLY.name,
        city = City.MAKALI.name,
        description = "",
        tlf = "076-889-666",
        photos = listOf(),
        openings = null,
        plevel = PriceLevel.EXPENSIVE.value,
        types = listOf(PlaceType.ATM.name, PlaceType.ART_GALLERY.name)

    )
)*/
