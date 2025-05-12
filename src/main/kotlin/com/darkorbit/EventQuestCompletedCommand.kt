package com.darkorbit

interface EventQuestCompletedCommand : ProtocolPacket {
	var eventType: String
	var repeatableType: String
}
