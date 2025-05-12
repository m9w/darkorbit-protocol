package com.darkorbit

interface LMLootCollectedCommand : ProtocolPacket {
	var collectedAmount: Int
	var lootId: String
	var priorityMode: LogMessengerPriorityModule
}
