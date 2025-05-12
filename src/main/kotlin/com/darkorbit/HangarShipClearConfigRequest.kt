package com.darkorbit

interface HangarShipClearConfigRequest : ProtocolPacket {
	var configId: Int
	var shipId: Long
	var wipe: Int
}
