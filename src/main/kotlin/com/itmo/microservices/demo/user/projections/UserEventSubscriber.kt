package com.itmo.microservices.demo.user.projections

import jakarta.annotation.PostConstruct
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class UserEventSubscriber {

    val Logger = LoggerFactory.getLogger(UserEventSubscriber::class.java)

//    lateinit var subscriptionsManager: AggregateSubscriptionsManager

    @PostConstruct
    fun init() {
//        subscriptionsManager.createSubscriber(UserAggregate::class, "some-subscriber-name") {
//            Logger.debug("subscriber created for user")
//        }
    }
}