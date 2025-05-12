package com.darkorbit

interface BattlePassInfoCommand : ProtocolPacket {
	var battlePassQuestModuleList: MutableList<BattlePassQuestModule>
	var filename: String
	var statusCommand: BattlePassUpdateStatusCommand
}
