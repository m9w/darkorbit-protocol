package com.darkorbit

interface InventoryItemModule : ProtocolPacket {
	var amount: Long
	var extAttributes: MutableList<TupleTwoModule>
	var hangarId: Long
	var inventoryItemAttributes: MutableList<InventoryItemAttributeModule>
	var isNew: Boolean
	var itemId: Long
	var lootId: String
	var star: Int
	var upgradeLevel: Int
}
