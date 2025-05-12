package com.darkorbit

interface LMCollectBankingMultiplierCommand : ProtocolPacket {
	var factor: Int
	var priorityMode: LogMessengerPriorityModule
}
