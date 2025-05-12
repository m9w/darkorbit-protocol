package com.darkorbit

interface EventANewHopeActionRequest : ProtocolPacket {
	var actionType: ANewHopeActionType
	var exchange: String
	var id: Int
}
