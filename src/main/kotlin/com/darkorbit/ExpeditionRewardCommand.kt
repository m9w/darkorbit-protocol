package com.darkorbit

interface ExpeditionRewardCommand : ProtocolPacket {
	var amount: Int
	var lootId: String
}
