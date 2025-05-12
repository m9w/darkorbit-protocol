package com.darkorbit

interface TeamDeathMatchOverviewModule : ProtocolPacket {
	var matchId: Int
	var matchState: TeamDeathMatchOverviewModuleMatchState
	var maxPlayerPerTeam: Int
	var opponent: FactionModule
	var playersInOwnTeam: Int
	var playersInQueue: Int
	var pointsOfOpponentTeam: Int
	var pointsOfOwnTeam: Int
}
