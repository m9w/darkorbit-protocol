package com.darkorbit

interface QuestElementModule : ProtocolPacket {
	var condition: QuestConditionModule
	var questCase: QuestCaseModule
}
