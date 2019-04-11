package com.wbtcb.coin.transfer.dto.message

import com.fasterxml.jackson.databind.JsonNode
import com.wbtcb.coin.transfer.enum.OutboundTransferStatus
import java.io.Serializable
import java.math.BigDecimal
import java.util.UUID

open class OutboundTransferMessage constructor(
    val externalId: UUID,
    val channelCode: String,
    val currencyCode: String,
    val addressTo: String,
    val amount: BigDecimal,
    val comment: String?,
    val status: OutboundTransferStatus,
    val metadata: JsonNode?
) : Serializable
