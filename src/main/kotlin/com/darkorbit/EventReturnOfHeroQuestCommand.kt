package com.darkorbit

interface EventReturnOfHeroQuestCommand : ProtocolPacket {
	var dailyNextRefreshSecond: Int
	var dailyQuests: MutableList<EventQuestDefinitionModule>
	var noRepeatNextRefreshSecond: Int
	var noRepeatQuests: MutableList<EventQuestDefinitionModule>
}
