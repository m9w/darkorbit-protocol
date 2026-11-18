package com.darkorbit

interface XenoResonatorSlotModule : ProtocolPacket {
	var enabled: Boolean
	var itemId: Long
	var slotId: Int
	var type: XenoResonatorSlotModuleType
}
