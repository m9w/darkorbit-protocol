package com.darkorbit

interface ShopItemLevelDataCommand : ProtocolPacket {
	var cost: String
	var currency: String
	var discountPercent: String
	var isElite: Int
	var isPaymentItem: Int
	var price: Int
}
