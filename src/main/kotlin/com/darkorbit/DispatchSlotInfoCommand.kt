package com.darkorbit

interface DispatchSlotInfoCommand : ProtocolPacket {
	var availableSlotCount: Short
	var currentMaxSlotCount: Short
}
