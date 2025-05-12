package com.darkorbit

interface HeroMoveCommand : ProtocolPacket {
	var x: Int
	var y: Int
}
