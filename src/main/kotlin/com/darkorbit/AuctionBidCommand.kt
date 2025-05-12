package com.darkorbit

interface AuctionBidCommand : ProtocolPacket {
	var curBid: AuctionDataCommand
	var myBid: AuctionDataCommand
	var stack: BaseStackCommand
	var success: Boolean
}
