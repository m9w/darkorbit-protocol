package com.darkorbit

interface ArmoryUnlockDrawRequest : ProtocolPacket {
	var count: Int
	var type: Int
}
