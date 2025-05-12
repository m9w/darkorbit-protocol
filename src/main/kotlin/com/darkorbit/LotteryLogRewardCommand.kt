package com.darkorbit

interface LotteryLogRewardCommand : ProtocolPacket {
	var amount: Int
	var lootId: String
}
