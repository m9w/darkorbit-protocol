package com.darkorbit

interface MoveCommand : ProtocolPacket {
	var timeToTarget: Int
	var userId: Int
	var x: Int
	var y: Int
}
