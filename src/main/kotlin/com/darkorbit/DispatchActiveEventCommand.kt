package com.darkorbit

interface DispatchActiveEventCommand : ProtocolPacket {
	var activeEvent: DispatchActiveEventCommandEventType
}
