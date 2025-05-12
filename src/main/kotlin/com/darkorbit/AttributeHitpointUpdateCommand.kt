package com.darkorbit

interface AttributeHitpointUpdateCommand : ProtocolPacket {
	var hitpointsMax: Int
	var hitpointsNow: Int
}
