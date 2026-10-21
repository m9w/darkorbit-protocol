package com.darkorbit

interface RecallBattlePassMissionRequest : ProtocolPacket {
	var requestId: Int
	var specialId: Int
}
