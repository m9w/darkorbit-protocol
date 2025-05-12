package com.darkorbit

interface DispatchModule : ProtocolPacket {
	var duration: Long
	var id: Short
	var slotId: Short
}
