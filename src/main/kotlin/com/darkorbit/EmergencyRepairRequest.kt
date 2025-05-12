package com.darkorbit

interface EmergencyRepairRequest : ProtocolPacket {
	var battleStationId: Int
	var slotId: Int
}
