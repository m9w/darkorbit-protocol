package com.darkorbit

interface DispatchSlotCostCommand : ProtocolPacket {
	var slotCosts: MutableList<DispatchSlotModule>
}
