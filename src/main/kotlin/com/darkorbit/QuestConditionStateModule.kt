package com.darkorbit

interface QuestConditionStateModule : ProtocolPacket {
	var active: Boolean
	var completed: Boolean
	var currentValue: Long
}
