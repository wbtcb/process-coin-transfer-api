package com.wbtcb.process.coin.enum

enum class PaymentStatus {
    /**
     * Incoming request to PAY
     */
    CREATED,
    /**
     * Valid message
     */
    VALID,
    /**
     * Invalid message
     */
    INVALID,
    /**
     * Prepare to pay
     */
    TO_PAY,
    /**
     * Cannot pay rejected by wallet
     */
    REJECTED,
    /**
     * In process paying (waiting to confirm transaction)
     */
    PENDING,
    /**
     * Paid
     */
    PAID
}
