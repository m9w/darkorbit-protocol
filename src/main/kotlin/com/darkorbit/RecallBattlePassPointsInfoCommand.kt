package com.darkorbit

interface RecallBattlePassPointsInfoCommand : ProtocolPacket {
	var points: Int
	var specialId: Int
}
