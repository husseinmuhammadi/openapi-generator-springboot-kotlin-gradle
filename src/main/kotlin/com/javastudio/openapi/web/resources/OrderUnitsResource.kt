package com.javastudio.openapi.web.resources

import com.javastudio.openapi.generated.v1.api.OrderUnitsApi
import com.javastudio.openapi.generated.v1.model.StoreOrderUnit
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
class OrderUnitsResource : OrderUnitsApi {

    override fun findAllOrderUnits(): ResponseEntity<List<StoreOrderUnit>> {
        return super.findAllOrderUnits()
    }

    override fun findOrderUnit(
        orderUnitId: Int,
        storeGroupId: String?,
        refDate: LocalDate?
    ): ResponseEntity<StoreOrderUnit> {
        return super.findOrderUnit(orderUnitId, storeGroupId, refDate)
    }
}