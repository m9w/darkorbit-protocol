package com.darkorbit

interface AuctionQuickBuyRequest : ProtocolPacket {
	var lootId: String
	var type: String
}
