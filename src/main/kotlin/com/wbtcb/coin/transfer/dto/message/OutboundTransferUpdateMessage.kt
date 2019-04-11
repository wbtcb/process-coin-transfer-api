package com.wbtcb.coin.transfer.dto.message

import com.fasterxml.jackson.databind.JsonNode
import com.wbtcb.coin.transfer.enum.OutboundTransferStatus
import java.math.BigDecimal
import java.util.UUID

class OutboundTransferUpdateMessage constructor(
    externalId: UUID,
    channelCode: String,
    currencyCode: String,
    addressTo: String,
    amount: BigDecimal,
    comment: String?,
    status: OutboundTransferStatus,
    metadata: JsonNode?,
    val transactionHash: String? = null,
    val fee: BigDecimal? = null,
    var reasons: List<MessageError>? = null
) : OutboundTransferMessage(
        externalId = externalId,
        channelCode = channelCode,
        currencyCode = currencyCode,
        addressTo = addressTo,
        amount = amount,
        comment = comment,
        status = status,
        metadata = metadata
    )
