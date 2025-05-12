package com.darkorbit

interface BattlePassQuestModule : ProtocolPacket {
	var acceptabilityStatus: QuestAcceptabilityStatusModule
	var questDefinition: QuestDefinitionModule
}
