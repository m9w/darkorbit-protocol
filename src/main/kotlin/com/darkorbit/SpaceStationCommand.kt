package com.darkorbit

interface SpaceStationCommand : ProtocolPacket {
	var id: Int
	var peaceRadius: Int
	var posX: Int
	var posY: Int
	var type: Int
}
