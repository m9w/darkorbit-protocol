package com.darkorbit

interface EventSummaryScoreCommand : ProtocolPacket {
	var factionModule: FactionModule
	var score: Long
}
