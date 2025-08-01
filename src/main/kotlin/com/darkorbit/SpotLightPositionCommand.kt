package com.darkorbit

interface SpotLightPositionCommand : ProtocolPacket {
	var id: Int
	var x: Int
	var y: Int
}
