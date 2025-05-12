package com.darkorbit

interface GalaxyGateBuilderGateLifeLostCommand : ProtocolPacket {
	var gateId: Byte
	var livesLeft: Int
}
