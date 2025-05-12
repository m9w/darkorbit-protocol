package com.darkorbit

interface InventoryItemPack : ProtocolPacket {
	var items: MutableList<HangarShipEquipmentInventoryItem>
}
