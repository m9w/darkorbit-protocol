package com.darkorbit

interface FrozenLabyrinthTimeInfoCommand : ProtocolPacket {
	var timeToEndLabyrinth: Long
	var timeToNextLabyrinth: Long
}
