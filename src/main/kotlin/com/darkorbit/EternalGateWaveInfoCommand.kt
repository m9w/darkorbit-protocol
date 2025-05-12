package com.darkorbit

interface EternalGateWaveInfoCommand : ProtocolPacket {
	var currentWave: Int
	var furthestWave: Int
	var nextMilestone: Int
}
