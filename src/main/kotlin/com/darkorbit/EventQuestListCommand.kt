package com.darkorbit

interface EventQuestListCommand : ProtocolPacket {
	var quests: MutableList<EventQuestDefinitionModule>
}
