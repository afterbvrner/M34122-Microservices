package com.itmo.microservices.demo.catalog.projections

import jakarta.annotation.PostConstruct
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class CatalogEventsSubscriber {

    val logger: Logger = LoggerFactory.getLogger(CatalogEventsSubscriber::class.java)

//    @Autowired
//    lateinit var subscriptionsManager: AggregateSubscriptionsManager

    @PostConstruct
    fun init() {
//        subscriptionsManager.createSubscriber(CatalogAggregate::class, "some-meaningful-name") {
//
//            `when`(ProductPriceChangedEvent::class) { event ->
//                logger.info("productPriceChanged: productId {}, new price {}", event.productId, event.price)
//            }
//
//            `when`(ItemAddedToCatalogEvent::class) { event ->
//                logger.info("Item Added: {}", event.productId)
//            }
//
//            `when`(ItemRemovedFromCatalogEvent::class) { event ->
//                logger.info("Item removed {}: ", event.productId)
//            }
//        }
    }
}