package com.darkorbit

interface ExchangeShopRequest : ProtocolPacket {
	var action: ExchangeShopRequestAction
	var eId: Int
	var eventName: String
	var shopId: String
}
