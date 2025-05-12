package com.darkorbit

interface EventProgressInfoCommand : ProtocolPacket {
	var remainingTimeInMS: Long
}
