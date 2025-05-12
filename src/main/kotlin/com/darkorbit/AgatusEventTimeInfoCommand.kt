package com.darkorbit

interface AgatusEventTimeInfoCommand : ProtocolPacket {
	var timeToEndSpawn: Long
	var timeToNextSpawn: Long
}
