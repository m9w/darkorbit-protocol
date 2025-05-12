package com.darkorbit

interface BattleStationErrorCommand : ProtocolPacket {
	var type: BattleStationErrorCommandErrorType
}
