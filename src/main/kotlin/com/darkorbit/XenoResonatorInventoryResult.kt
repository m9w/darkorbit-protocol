package com.darkorbit

interface XenoResonatorInventoryResult : ProtocolPacket {
	var batchCount: Int
	var batchIndex: Int
	var items: MutableList<HangarShipEquipmentInventoryItem>
	var status: XenoResonatorInventoryResultStatus
}
