package com.darkorbit

interface UIMinimapMarkerCommand : ProtocolPacket {
	var id: Int
	var maxPing: Int
	var playSound: Boolean
	var x: Int
	var y: Int
}
