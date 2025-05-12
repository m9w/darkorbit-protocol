package com.darkorbit

interface QuestGiversAvailableCommand : ProtocolPacket {
	var questGivers: MutableList<QuestGiverModule>
}
