package com.darkorbit

interface UnequipModuleRequest : ProtocolPacket {
	var battleStationId: Int
	var itemId: Int
}
