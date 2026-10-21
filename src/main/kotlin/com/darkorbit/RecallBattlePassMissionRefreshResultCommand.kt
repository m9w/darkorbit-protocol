package com.darkorbit

interface RecallBattlePassMissionRefreshResultCommand : ProtocolPacket {
	var requestId: Int
	var result: RecallBattlePassMissionRefreshResultCommandResult
	var specialId: Int
}
