package com.darkorbit

interface AuctionQuickBuyCommand : ProtocolPacket {
	var stack: BaseStackCommand
	var success: Boolean
}
