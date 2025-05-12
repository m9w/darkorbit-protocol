package com.darkorbit

interface LMCollectCreditsCommand : ProtocolPacket {
	var collectedAmount: Int
	var priorityMode: LogMessengerPriorityModule
	var summedAmount: Int
}
