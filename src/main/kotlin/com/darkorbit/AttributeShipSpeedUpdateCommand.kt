package com.darkorbit

interface AttributeShipSpeedUpdateCommand : ProtocolPacket {
	var displaySpeed: Int
	var newSpeed: Int
}
