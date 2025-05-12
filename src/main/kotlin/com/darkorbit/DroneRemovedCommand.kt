package com.darkorbit

interface DroneRemovedCommand : ProtocolPacket {
	var droneId: Long
}
