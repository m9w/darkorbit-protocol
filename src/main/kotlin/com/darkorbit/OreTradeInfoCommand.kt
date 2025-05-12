package com.darkorbit

interface OreTradeInfoCommand : ProtocolPacket {
	var duraniumPrice: Int
	var enduriumPrice: Int
	var osmiumPrice: Int
	var palladiumExchangeRate: Int
	var promeriumPrice: Int
	var prometidPrice: Int
	var prometiumPrice: Int
	var remainingCharges: Int
	var sepromPrice: Int
	var terbiumPrice: Int
	var type: TradeType
}
