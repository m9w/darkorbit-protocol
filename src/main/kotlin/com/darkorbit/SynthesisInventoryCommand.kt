package com.darkorbit

interface SynthesisInventoryCommand : ProtocolPacket {
	var equipmentInventoryItems: MutableList<HangarShipEquipmentInventoryItem>
	var remove: Boolean
}
