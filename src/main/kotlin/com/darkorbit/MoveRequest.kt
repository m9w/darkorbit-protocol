package com.darkorbit

interface MoveRequest : ProtocolPacket {
	var positionX: Int
	var positionY: Int
	var targetX: Int
	var targetY: Int
}
