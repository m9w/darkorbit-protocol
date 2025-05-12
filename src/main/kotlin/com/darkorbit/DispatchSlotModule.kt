package com.darkorbit

interface DispatchSlotModule : ProtocolPacket {
	var costList: MutableList<LootModule>
	var slotId: Int
}
