package com.darkorbit

interface EventUpdateCommand : ProtocolPacket {
	var activeCommands: MutableList<EventModule>
	var timestamp: Long
	var utcTimeOffset: Int
}
