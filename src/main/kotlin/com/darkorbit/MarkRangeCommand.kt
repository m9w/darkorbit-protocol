package com.darkorbit

interface MarkRangeCommand : ProtocolPacket {
	var color: Int
	var durationMillis: Int
	var range: Int
	var uid: Int
}
