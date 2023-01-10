package com.itmo.microservices.demo.user.config

import org.springframework.context.annotation.Configuration

@Configuration
class UserConfig {

//    private val logger = LoggerFactory.getLogger(UserConfig::class.java)
//
//    @Autowired
//    private lateinit var subscriptionsManager: AggregateSubscriptionsManager
//
//    @Autowired
//    private lateinit var userEventSubscriber: AnnotationBasedUserEventSubscriber
//
//    @Autowired
//    private lateinit var eventStreamManager: AggregateEventStreamManager
//
//    @Autowired
//    private lateinit var eventSourcingServiceFactory: EventSourcingServiceFactory
//
//    @PostConstruct
//    fun init() {
//        subscriptionsManager.subscribe<UserAggregate>(userEventSubscriber)
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
//    }

//    @Bean
//    fun userESService() = eventSourcingServiceFactory.create<UUID, UserAggregate, UserAggregateState>()
}