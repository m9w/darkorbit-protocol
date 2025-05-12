package com.darkorbit

interface EventQuestDefinitionModule : ProtocolPacket {
	var claimed: Boolean
	var completed: Boolean
	var module: QuestDefinitionModule
}
