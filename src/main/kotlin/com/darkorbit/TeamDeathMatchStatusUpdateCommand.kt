package com.darkorbit

interface TeamDeathMatchStatusUpdateCommand : ProtocolPacket {
	var currentFactionScores: MutableList<FactionScoreModule>
	var initSeconds: Int
	var maxScore: Int
	var overallEventScores: MutableList<FactionScoreModule>
	var remainingLifes: Int
	var remainingSeconds: Int
}
