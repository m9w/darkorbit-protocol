package com.darkorbit

interface AuctionBidRequest : ProtocolPacket {
	var lootId: String
	var price: Long
	var type: String
}
