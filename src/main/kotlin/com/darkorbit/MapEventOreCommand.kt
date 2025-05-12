package com.darkorbit

interface MapEventOreCommand : ProtocolPacket {
	var eventType: MapEventOreCommandEventType
	var hash: String
	var oreType: OreTypeModule
}
