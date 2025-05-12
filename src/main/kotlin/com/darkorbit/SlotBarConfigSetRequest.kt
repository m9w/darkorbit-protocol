package com.darkorbit

interface SlotBarConfigSetRequest : ProtocolPacket {
	var menuItemId: String
	var slotBarIdFrom: String
	var slotBarIdTo: String
	var slotIdFrom: Int
	var slotIdTo: Int
}
