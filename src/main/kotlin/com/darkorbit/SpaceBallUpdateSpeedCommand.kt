package com.darkorbit

interface SpaceBallUpdateSpeedCommand : ProtocolPacket {
	var factionId: Int
	var speed: Int
}
