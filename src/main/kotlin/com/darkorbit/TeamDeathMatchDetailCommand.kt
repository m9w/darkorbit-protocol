package com.darkorbit

interface TeamDeathMatchDetailCommand : ProtocolPacket {
	var matchId: Int
	var maxPlayersPerTeam: Int
	var maxTimeInSecs: Int
	var minPlayersPerTeam: Int
	var opponentFaction: FactionModule
	var ownFaction: FactionModule
	var playersInOpponentTeam: Int
	var playersInOwnTeam: Int
	var pointsOfOpponentTeam: Int
	var pointsOfOwnTeam: Int
	var remainingTimeInSecs: Int
}
