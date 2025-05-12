package com.darkorbit

interface MapEventDroneInfoCommand : ProtocolPacket {
	var legacyDroneCommandString: String
	var simple: Boolean
}
