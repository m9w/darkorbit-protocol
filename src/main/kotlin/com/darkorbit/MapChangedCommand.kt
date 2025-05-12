package com.darkorbit

interface MapChangedCommand : ProtocolPacket {
	var newMapId: Int
}
