package com.darkorbit

interface BuildStationRequest : ProtocolPacket {
	var battleStationId: Int
	var buildTimeInMinutes: Int
}
