package com.darkorbit

interface GalaxyGateBuilderSetupGateCommand : ProtocolPacket {
	var errorCode: GalaxyGateBuilderSetupGateCommandErrorCode
	var id: Byte
	var lifePrice: Int
	var livesLeft: Int
}
