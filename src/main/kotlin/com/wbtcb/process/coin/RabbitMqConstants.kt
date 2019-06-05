package com.wbtcb.process.coin

class RabbitMqConstants {

    companion object {

        /**
            Claim transfer process
         */
        const val CLAIM_EXCHANGE = "claim"

        // Routing key
        const val CLAIM_COIN_ROUTING_PREFIX_KEY = "$CLAIM_EXCHANGE.coin"

        /**
            Payment transfer process
         */
        const val PAYMENT_EXCHANGE = "pay"

        const val PAYMENT_COIN_ROUTING_PREFIX_KEY = "$PAYMENT_EXCHANGE.coin"
    }
}
