package com.darkorbit

interface InventoryItemUpdatedCommand : ProtocolPacket {
	var item: InventoryItemModule
}
