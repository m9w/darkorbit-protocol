package com.darkorbit

interface BattlePassUpdateStatusCommand : ProtocolPacket {
	var purchased: Boolean
	var questsToCollectReward: MutableList<Int>
}
