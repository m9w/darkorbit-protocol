package com.darkorbit

interface TrainingArenaPerformanceInfoCommand : ProtocolPacket {
	var performance: MutableList<TrainingArenaPerformanceEntryCommand>
}
