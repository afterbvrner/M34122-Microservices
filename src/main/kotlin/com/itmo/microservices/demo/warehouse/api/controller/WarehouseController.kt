package com.itmo.microservices.demo.warehouse.api.controller

import com.itmo.microservices.demo.warehouse.api.model.WarehouseItemModel
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/warehouse")
class WarehouseController
//    val warehouseEventSourcingService: EventSourcingService<UUID, WarehouseAggregate, Warehouse>) {
{

    @GetMapping("/items")
    fun allItems(
        @RequestParam available: Boolean,
        @RequestParam size: Int,
    ): List<WarehouseItemModel> = TODO("Not yet implemented")
}