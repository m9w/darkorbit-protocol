package com.darkorbit

interface MapEventMapTitleUpdateCommand : ProtocolPacket {
	var mapId: Int
	var mapTitle: String
}
