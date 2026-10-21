package com.darkorbit

interface RecallBattlePassActionRequest : ProtocolPacket {
	var action: RecallBattlePassActionRequestAction
	var requestId: Int
	var specialId: Int
}
