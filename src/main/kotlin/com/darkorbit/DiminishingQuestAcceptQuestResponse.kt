package com.darkorbit

interface DiminishingQuestAcceptQuestResponse : ProtocolPacket {
	var acceptabilityStatus: QuestAcceptabilityStatusModule
	var timeToQuestEnd: Long
}
