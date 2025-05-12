package com.darkorbit

interface ShipSelectRequest : ProtocolPacket {
	var clickX: Int
	var clickY: Int
	var posX: Int
	var posY: Int
	var radius: Int
	var targetId: Int
	var targetX: Int
	var targetY: Int
}
