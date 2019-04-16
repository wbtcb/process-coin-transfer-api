package com.wbtcb.coin.transfer.dto.message

import com.fasterxml.jackson.databind.JsonNode
import com.wbtcb.coin.transfer.enum.OutboundTransferStatus
import java.math.BigDecimal
import java.io.Serializable
import java.util.UUID

data class OutboundTransferUpdateMessage constructor(
    val externalId: UUID,
    val channelCode: String,
    val currencyCode: String,
    val addressTo: String,
    val amount: BigDecimal,
    val comment: String?,
    val status: OutboundTransferStatus,
    val metadata: JsonNode?,
    val transactionHash: String? = null,
    val fee: BigDecimal? = null,
    var reasons: List<MessageError>? = null
) : Serializable
