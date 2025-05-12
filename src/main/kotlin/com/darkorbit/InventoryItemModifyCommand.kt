package com.darkorbit

interface InventoryItemModifyCommand : ProtocolPacket {
	var hangarId: Long
	var itemId: Long
	var quantity: Long
}
