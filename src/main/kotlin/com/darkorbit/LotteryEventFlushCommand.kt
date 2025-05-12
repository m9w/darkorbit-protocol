package com.darkorbit

interface LotteryEventFlushCommand : ProtocolPacket {
	var spcId: Int
	var state: Boolean
}
