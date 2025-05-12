package com.darkorbit

interface DropRequest : ProtocolPacket {
	var toDrop: DropType
}
