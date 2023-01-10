package com.itmo.microservices.demo.catalog.config

import com.itmo.microservices.demo.catalog.projections.AnnotationBasedCatalogEventsSubscriber
import jakarta.annotation.PostConstruct
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration

@Configuration
class CatalogConfig {

    private val logger = LoggerFactory.getLogger(CatalogConfig::class.java)

//    @Autowired
//    private lateinit var subscriptionsManager: AggregateSubscriptionsManager

    @Autowired
    // todo
    private lateinit var catalogEventSubscriber: AnnotationBasedCatalogEventsSubscriber

//    @Autowired
//    private lateinit var eventSourcingServiceFactory: EventSourcingServiceFactory

//    @Autowired
//    private lateinit var eventStreamManager: AggregateEventStreamManager
//
//    @Autowired
//    private lateinit var aggregateRegistry: AggregateRegistry

    @PostConstruct
    fun init() {

//        subscriptionsManager.subscribe<CatalogAggregate>(catalogEventSubscriber)
//
//        eventStreamManager.maintenance {
//            onRecordHandledSuccessfully { streamName, eventName ->
//                logger.info("Stream $streamName successfully processed record of $eventName")
//            }
//
//            onBatchRead { streamName, batchSize ->
//                logger.info("Stream $streamName read batch size: $batchSize")
//            }
//        }
    }

//    @Bean
//    fun catalogESService() = eventSourcingServiceFactory.create<String, CatalogAggregate, CatalogAggregateState>()
}