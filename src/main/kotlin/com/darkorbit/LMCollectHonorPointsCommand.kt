package com.darkorbit

interface LMCollectHonorPointsCommand : ProtocolPacket {
	var collectedAmount: Int
	var priorityMode: LogMessengerPriorityModule
	var summedAmount: Int
}
