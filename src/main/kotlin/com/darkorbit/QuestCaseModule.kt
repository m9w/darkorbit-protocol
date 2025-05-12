package com.darkorbit

interface QuestCaseModule : ProtocolPacket {
	var active: Boolean
	var id: Int
	var mandatory: Boolean
	var mandatoryCount: Int
	var modifier: MutableList<QuestElementModule>
	var ordered: Boolean
}
