package com.itmo.microservices.demo.delivery.impl.entity

import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

class Delivery {


    @Id
    @GeneratedValue
    var id: String? = null
    var address: String? = null
    var userId: String? = null
    var deliverySlot: String? = null

    constructor()

    constructor(id: String, address: String, userId: String, deliverySlot: String) {
        this.id = id
        this.address = address
        this.userId = userId
        this.deliverySlot = deliverySlot
    }
}