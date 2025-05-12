package com.darkorbit

interface AuctionTestCommand : ProtocolPacket {
	var args: MutableList<String>
}
