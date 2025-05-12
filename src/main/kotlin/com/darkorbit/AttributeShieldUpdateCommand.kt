package com.darkorbit

interface AttributeShieldUpdateCommand : ProtocolPacket {
	var shieldMax: Int
	var shieldNow: Int
}
