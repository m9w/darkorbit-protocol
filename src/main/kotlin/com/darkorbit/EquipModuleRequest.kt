package com.darkorbit

interface EquipModuleRequest : ProtocolPacket {
	var battleStationId: Int
	var itemId: Int
	var replace: Boolean
	var slotId: Int
}
