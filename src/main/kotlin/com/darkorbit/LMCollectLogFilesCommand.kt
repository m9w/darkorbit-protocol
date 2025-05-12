package com.darkorbit

interface LMCollectLogFilesCommand : ProtocolPacket {
	var collectedAmount: Int
	var priorityMode: LogMessengerPriorityModule
	var summedAmount: Int
}
