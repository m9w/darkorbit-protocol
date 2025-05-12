package com.darkorbit

interface InventoryItemModule : ProtocolPacket {
	var amount: Long
	var hangarId: Long
	var inventoryItemAttributes: MutableList<InventoryItemAttributeModule>
	var isNew: Boolean
	var itemId: Long
	var lootId: String
	var upgradeLevel: Int
}
