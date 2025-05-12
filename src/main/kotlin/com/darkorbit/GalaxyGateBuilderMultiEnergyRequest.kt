package com.darkorbit

interface GalaxyGateBuilderMultiEnergyRequest : ProtocolPacket {
	var gateId: Byte
	var spinAmount: Byte
	var useMultiplier: Boolean
}
