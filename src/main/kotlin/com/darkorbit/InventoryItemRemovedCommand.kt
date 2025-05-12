package com.darkorbit

interface InventoryItemRemovedCommand : ProtocolPacket {
	var itemId: Long
}
