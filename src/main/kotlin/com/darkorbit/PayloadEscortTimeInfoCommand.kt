package com.darkorbit

interface PayloadEscortTimeInfoCommand : ProtocolPacket {
	var timeToGateClose: Long
	var timeToNextSpawn: Long
	var timeToSessionEnd: Long
}
