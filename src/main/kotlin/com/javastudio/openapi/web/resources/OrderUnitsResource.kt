package com.javastudio.openapi.web.resources

import com.javastudio.openapi.generated.v1.api.OrderUnitsApi
import com.javastudio.openapi.generated.v1.model.OrderUnit
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class OrderUnitsResource : OrderUnitsApi {

    override fun findAllOrderUnits(
        retailItemId: Long?,
        supplierId: Long?,
        depotId: Long?,
        page: Int,
        size: Int
    ): ResponseEntity<List<OrderUnit>> {
        return super.findAllOrderUnits(retailItemId, supplierId, depotId, page, size)
    }

    override fun findOrderUnit(orderUnitId: Int): ResponseEntity<OrderUnit> {
        return super.findOrderUnit(orderUnitId)
    }
}