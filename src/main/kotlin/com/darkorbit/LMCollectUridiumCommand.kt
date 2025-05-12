package com.darkorbit

interface LMCollectUridiumCommand : ProtocolPacket {
	var collectedAmount: Int
	var priorityMode: LogMessengerPriorityModule
	var summedAmount: Int
}
