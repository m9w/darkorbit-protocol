package com.darkorbit

interface InventoryItemSellPack : ProtocolPacket {
	var itemId: Int
	var quantity: Int
}
