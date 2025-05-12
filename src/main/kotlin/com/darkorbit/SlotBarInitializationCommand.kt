package com.darkorbit

interface SlotBarInitializationCommand : ProtocolPacket {
	var slotBarId: String
	var slotBarOrder: String
	var slotBarPosition: String
	var slots: MutableList<SlotInfoCommand>
	var visible: Boolean
}
