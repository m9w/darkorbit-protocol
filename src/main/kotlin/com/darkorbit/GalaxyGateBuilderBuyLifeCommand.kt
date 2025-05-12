package com.darkorbit

interface GalaxyGateBuilderBuyLifeCommand : ProtocolPacket {
	var errorCode: GalaxyGateBuilderBuyLifeCommandErrorCode
	var gateId: Byte
	var gateMode: String
	var lifePrice: Int
	var livesLeft: Int
	var money: Long
	var multiplier: Byte
	var samples: Long
}
