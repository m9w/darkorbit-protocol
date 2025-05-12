package com.darkorbit

interface QuestGiverModule : ProtocolPacket {
	var mapObjectId: Int
	var questGiverId: Int
	var toolTip: MessageKeyListWildcardCommand
}
