package com.darkorbit

interface SummonNPCRequest : ProtocolPacket {
	var amount: Int
	var npcTypeString: String
}
