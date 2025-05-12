package com.darkorbit

interface TdmResultCommand : ProtocolPacket {
	var loser: FactionModule
	var loserScore: Int
	var matchDurationInSeconds: Int
	var targetScore: Int
	var winner: FactionModule
	var winnerScore: Int
}
