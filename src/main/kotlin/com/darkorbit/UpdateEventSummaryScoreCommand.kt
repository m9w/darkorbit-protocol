package com.darkorbit

interface UpdateEventSummaryScoreCommand : ProtocolPacket {
	var eventEnd: Boolean
	var eventType: String
	var scoreCommandList: MutableList<EventSummaryScoreCommand>
}
