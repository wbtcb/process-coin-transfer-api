package com.wbtcb.process.coin.dto.message

import com.fasterxml.jackson.databind.JsonNode
import com.wbtcb.process.coin.enum.InboundTransferStatus
import java.io.Serializable
import java.math.BigDecimal
import java.util.UUID

data class InboundTransferUpdateMessage constructor(
    val externalId: UUID,
    val channelCode: String,
    val currencyCode: String,
    val addressTo: String?,
    val amount: BigDecimal,
    val comment: String?,
    val status: InboundTransferStatus,
    val transactionHash: String?,
    val metadata: JsonNode?,
    var reasons: List<MessageError>? = null
) : Serializable
