package com.darkorbit

interface EventANewHopeQuestCommand : ProtocolPacket {
	var dailyNextRefreshSecond: Int
	var dailyQuests: MutableList<EventQuestDefinitionModule>
	var noRepeatNextRefreshSecond: Int
	var noRepeatQuests: MutableList<EventQuestDefinitionModule>
}
