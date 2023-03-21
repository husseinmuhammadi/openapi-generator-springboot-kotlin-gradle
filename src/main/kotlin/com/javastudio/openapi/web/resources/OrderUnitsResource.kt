package com.javastudio.openapi.web.resources

import com.javastudio.openapi.generated.v1.api.OrderUnitsApi
import com.javastudio.openapi.generated.v1.model.OrderUnit
import com.javastudio.openapi.generated.v1.model.StoreOrderUnit
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
class OrderUnitsResource : OrderUnitsApi {

    override fun findAllOrderUnits(
        retailItemId: Long?,
        supplierId: Long?,
        depotId: Long?
    ): ResponseEntity<List<OrderUnit>> {
        return super.findAllOrderUnits(retailItemId, supplierId, depotId)
    }

    override fun findOrderUnit(
        orderUnitId: Int,
        storeGroupId: String?,
        refDate: LocalDate?
    ): ResponseEntity<OrderUnit> {
        return super.findOrderUnit(orderUnitId, storeGroupId, refDate)
    }
}