package com.darkorbit

interface EventUnityClientRewardQuestCommand : ProtocolPacket {
	var afterQuests: MutableList<EventQuestListCommand>
	var beforeQuests: MutableList<EventQuestListCommand>
	var nowQuests: EventQuestListCommand
}
