package com.darkorbit

interface SlotInfoCommand : ProtocolPacket {
	var menuItemId: String
	var slotId: Int
}
