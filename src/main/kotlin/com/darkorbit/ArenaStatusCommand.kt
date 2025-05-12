package com.darkorbit

interface ArenaStatusCommand : ProtocolPacket {
	var arenaType: ArenaType
	var currentRound: Int
	var opponentId: Int
	var opponentInstanceId: Int
	var opponentName: String
	var participants: Int
	var secondsLeftInPhase: Int
	var status: MatchStatus
	var survivors: Int
	var warpWarningOffsetSeconds: Int
}
