package com.wbtcb.process.coin.dto.message

import com.fasterxml.jackson.databind.JsonNode
import com.wbtcb.process.coin.enum.ClaimStatus
import java.math.BigDecimal
import java.io.Serializable
import java.util.UUID

data class ClaimUpdateMessage constructor(
    val orderRef: UUID,
    val channelCode: String,
    val currencyCode: String,
    val claimAddress: String?,
    val amount: BigDecimal,
    val comment: String?,
    val status: ClaimStatus,
    val metadata: JsonNode?,
    val transactionHash: String? = null,
    val fee: BigDecimal? = null,
    var reasons: List<MessageError>? = null
) : Serializable
