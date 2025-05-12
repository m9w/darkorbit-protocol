package com.darkorbit

interface AttributeCreditsUpdateCommand : ProtocolPacket {
	var credits: Int
	var jackpot: Float
	var uridium: Int
}
