package com.darkorbit

interface NpcEventTimeInfoCommand : ProtocolPacket {
	var timeToEndSpawn: Long
	var timeToNextSpawn: Long
}
