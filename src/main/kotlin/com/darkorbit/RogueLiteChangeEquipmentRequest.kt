package com.darkorbit

interface RogueLiteChangeEquipmentRequest : ProtocolPacket {
	var modifiedItemIds: MutableList<Long>
}
