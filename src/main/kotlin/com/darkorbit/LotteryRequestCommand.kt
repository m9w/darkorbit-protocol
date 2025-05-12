package com.darkorbit

interface LotteryRequestCommand : ProtocolPacket {
	var change: Int
	var lotteryItems: Int
	var lotteryLogCommandList: MutableList<LotteryLogCommand>
	var quantity: Int
}
