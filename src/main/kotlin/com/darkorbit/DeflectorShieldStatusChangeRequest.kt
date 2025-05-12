package com.darkorbit

interface DeflectorShieldStatusChangeRequest : ProtocolPacket {
	var battleStationId: Int
	var minutes: Int
}
