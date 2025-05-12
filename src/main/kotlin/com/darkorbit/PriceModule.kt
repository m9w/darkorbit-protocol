package com.darkorbit

interface PriceModule : ProtocolPacket {
	var amount: Int
	var type: PriceModuleCurrencyType
}
