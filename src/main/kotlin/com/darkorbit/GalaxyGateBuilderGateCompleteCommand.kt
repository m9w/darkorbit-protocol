package com.darkorbit

interface GalaxyGateBuilderGateCompleteCommand : ProtocolPacket {
	var currPart: Short
	var gateId: Byte
}
