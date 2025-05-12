package com.darkorbit

interface LotteryLogCommand : ProtocolPacket {
	var amountCapsules: Int
	var converter: String
	var date: String
	var lcId: Int
	var lotteryLogRewardCommandList: MutableList<LotteryLogRewardCommand>
}
