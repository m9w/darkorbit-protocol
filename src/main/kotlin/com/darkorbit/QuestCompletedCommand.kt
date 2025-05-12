package com.darkorbit

interface QuestCompletedCommand : ProtocolPacket {
	var id: Int
	var rating: Int
}
