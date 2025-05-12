package com.darkorbit

interface HealBeamCommand : ProtocolPacket {
	var sourceId: String
	var sourcePositionX: Int
	var sourcePositionY: Int
	var targetId: Int
}
