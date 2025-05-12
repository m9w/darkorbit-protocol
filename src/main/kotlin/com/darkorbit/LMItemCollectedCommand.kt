package com.darkorbit

interface LMItemCollectedCommand : ProtocolPacket {
	var lootId: String
	var priorityMode: LogMessengerPriorityModule
}
