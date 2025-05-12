package com.darkorbit

interface OutOfBattleStationRangeCommand : ProtocolPacket {
	var battleStationId: Int
}
