package com.darkorbit

interface EventCommand : ProtocolPacket {
	var eventId: Int
	var planetId: Int
}
