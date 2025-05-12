package com.darkorbit

interface DroneFormationChangeCommand : ProtocolPacket {
	var selectedFormationId: Int
	var uid: Int
}
