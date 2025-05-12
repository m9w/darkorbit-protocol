package com.darkorbit

interface AttributeLevelUpUpdateCommand : ProtocolPacket {
	var epToNextLevel: Int
	var level: Int
}
