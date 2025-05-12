package com.darkorbit

interface EternalBlacklightWaveInfoCommand : ProtocolPacket {
	var currentWave: Int
	var furthestWave: Int
}
