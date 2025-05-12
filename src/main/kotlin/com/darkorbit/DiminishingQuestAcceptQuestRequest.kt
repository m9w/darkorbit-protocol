package com.darkorbit

interface DiminishingQuestAcceptQuestRequest : ProtocolPacket {
	var acceptabilityStatus: QuestAcceptabilityStatusModule
	var questId: Int
}
