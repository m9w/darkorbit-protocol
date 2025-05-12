package com.darkorbit

interface DiminishingQuestInitializationCommand : ProtocolPacket {
	var acceptabilityStatus: QuestAcceptabilityStatusModule
	var quest: QuestDefinitionModule
	var timeToQuestEnd: Long
}
