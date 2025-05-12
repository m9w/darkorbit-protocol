package com.darkorbit

interface EternalBlacklightBoosterCommand : ProtocolPacket {
	var boosterType: EternalBlacklightBoosterCommandBoosterType
	var value: Int
}
