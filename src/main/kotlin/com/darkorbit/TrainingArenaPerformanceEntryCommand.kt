package com.darkorbit

interface TrainingArenaPerformanceEntryCommand : ProtocolPacket {
	var rank: Int
	var seasonName: String
}
