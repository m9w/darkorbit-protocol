package com.darkorbit

interface QuestConditionModule : ProtocolPacket {
	var displayType: ConditionType
	var id: Int
	var mandatory: Boolean
	var matches: MutableList<String>
	var state: QuestConditionStateModule
	var subConditions: MutableList<QuestConditionModule>
	var targetValue: Long
	var type: ConditionType
}
