package com.darkorbit

interface VIPMerchantExchangeItemModule : ProtocolPacket {
	var amount: Int
	var amountOwned: Long
	var lootId: String
}
