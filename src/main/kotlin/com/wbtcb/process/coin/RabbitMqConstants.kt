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
        const val PAYMENT_EXCHANGE = "payment"

        const val PAYMENT_COIN_ROUTING_PREFIX_KEY = "$PAYMENT_EXCHANGE.coin"

        /**
         * Inbound (and Outbound) process
         */
        const val COIN_WALLET_EXCHANGE = "coin-wallet"

        const val COIN_WALLET_INBOUND_ROUTING_PREFIX_KEY = "$COIN_WALLET_EXCHANGE.inbound"

        /**
         * TODO this is not needs so far is not implemented
         */
        const val COIN_WALLET_OUTBOUND_ROUTING_PREFIX_KEY = "$COIN_WALLET_EXCHANGE.outbound"
    }
}
