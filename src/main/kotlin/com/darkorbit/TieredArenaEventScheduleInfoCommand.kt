package com.darkorbit

interface TieredArenaEventScheduleInfoCommand : ProtocolPacket {
	var timeToArenaClose: Long
	var timeToNextArenaOpen: Long
}
