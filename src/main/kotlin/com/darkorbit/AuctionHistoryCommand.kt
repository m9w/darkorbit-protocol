package com.darkorbit

interface AuctionHistoryCommand : ProtocolPacket {
	var auctionStartTime: String
	var currendBid: Long
	var group: String
	var lootId: String
	var type: String
	var winnerId: Int
	var winnerName: String
}
