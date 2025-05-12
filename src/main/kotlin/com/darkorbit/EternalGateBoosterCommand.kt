package com.darkorbit

interface EternalGateBoosterCommand : ProtocolPacket {
	var boosterType: EternalGateBoosterCommandBoosterType
	var value: Int
}
