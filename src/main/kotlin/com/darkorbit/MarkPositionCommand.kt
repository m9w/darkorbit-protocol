package com.darkorbit

interface MarkPositionCommand : ProtocolPacket {
	var color: Int
	var durationMillis: Int
	var x: Int
	var y: Int
}
