package com.darkorbit

interface GalaxyGateBuilderGetGatePartsCommand : ProtocolPacket {
	var errorCode: GalaxyGateBuilderGetGatePartsCommandErrorCode
	var gateId: Byte
	var gatePartIds: MutableList<Short>
}
