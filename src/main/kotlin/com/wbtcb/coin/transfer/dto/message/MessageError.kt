package com.wbtcb.coin.transfer.dto.message

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import kotlin.reflect.KProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
data class MessageError(

    @JsonIgnore
    val errorType: ErrorType,
    @JsonIgnore
    val field: KProperty<*>?,
    @JsonIgnore
    val value: Any?,
    val detail: String? = null
) {

    private val fieldName: String?
        @JsonIgnore
        get() = this.field?.let {
            PropertyNamingStrategy.SnakeCaseStrategy().translate(it.name)
        }

    val code
        get() = this.errorType.code

    val title
        get() = this.errorType.title

    val meta
        get() = ObjectMapper().createObjectNode().apply {
            put("source", fieldName)
            put("value", value.toString())
        }
}

enum class ErrorType(val code: String, val title: String) {
    // 1xx validation errors header
    InvalidHeaderFormat("100", "Invalid header, expected format: {channel}.{environment}.{node}"),
    InvalidHeaderEnv("101", "Incompatible header environment"),

    // 2xx validation errors payload
    InvalidValue("201", "Invalid value"),
    ValueOutOfRange("202", "Value out of range"),

    // 3xx others errors
    WalletError("351", "Wallet error"),
    TransactionError("352", "Transaction error");

    companion object {
        fun toErrorType(code: String?): ErrorType? {
            return ErrorType.values().singleOrNull { it.code == code }
        }
    }
}
