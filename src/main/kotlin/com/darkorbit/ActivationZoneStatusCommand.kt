package com.darkorbit

interface ActivationZoneStatusCommand : ProtocolPacket {
	var currentValue: Int
	var maxValue: Int
	var poiId: String
}
