package com.darkorbit

interface GalaxyGateBuilderGateWaveUpdateCommand : ProtocolPacket {
	var currWave: Short
	var gateId: Byte
}
