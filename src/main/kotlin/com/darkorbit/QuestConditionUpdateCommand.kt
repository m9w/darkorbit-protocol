package com.darkorbit

interface QuestConditionUpdateCommand : ProtocolPacket {
	var questConditionId: Int
	var state: QuestConditionStateModule
}
