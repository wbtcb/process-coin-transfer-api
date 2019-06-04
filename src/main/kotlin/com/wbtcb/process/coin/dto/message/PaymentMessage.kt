package com.wbtcb.process.coin.dto.message

import com.fasterxml.jackson.databind.JsonNode
import com.wbtcb.process.coin.enum.PaymentStatus
import java.io.Serializable
import java.math.BigDecimal
import java.util.UUID

data class PaymentMessage constructor(
    val orderRef: UUID,
    val channelCode: String,
    val currencyCode: String,
    val addressTo: String,
    val amount: BigDecimal,
    val comment: String?,
    val status: PaymentStatus,
    val metadata: JsonNode?
) : Serializable
