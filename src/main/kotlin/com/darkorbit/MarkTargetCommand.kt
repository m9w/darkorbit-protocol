package com.darkorbit

interface MarkTargetCommand : ProtocolPacket {
	var positionX: Int
	var positionY: Int
	var targetId: Int
	var userId: Int
}
