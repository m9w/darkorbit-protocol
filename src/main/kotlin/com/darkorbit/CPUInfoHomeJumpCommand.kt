package com.darkorbit

interface CPUInfoHomeJumpCommand : ProtocolPacket {
	var chargesLeft: Int
	var homeMapId: Int
	var level: Int
}
