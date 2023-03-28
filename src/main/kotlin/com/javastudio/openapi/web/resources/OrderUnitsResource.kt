package com.javastudio.openapi.web.resources

import com.javastudio.openapi.generated.v1.api.OrderUnitsApi
import com.javastudio.openapi.generated.v1.model.OrderUnit
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderUnitsResource : OrderUnitsApi {

    override fun findAllOrderUnits(
        retailItemId: Long?,
        supplierId: Long?,
        depotId: Long?,
        offset: Int?,
        limit: Int?
    ): ResponseEntity<List<OrderUnit>> {
        return super.findAllOrderUnits(retailItemId, supplierId, depotId, offset, limit)
    }

    override fun findOrderUnit(orderUnitId: Int): ResponseEntity<OrderUnit> {
        return super.findOrderUnit(orderUnitId)
    }
}