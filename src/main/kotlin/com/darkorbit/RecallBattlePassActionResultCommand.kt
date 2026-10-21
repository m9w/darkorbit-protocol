package com.darkorbit

interface RecallBattlePassActionResultCommand : ProtocolPacket {
	var requestId: Int
	var result: RecallBattlePassActionResultCommandResult
	var specialId: Int
}
