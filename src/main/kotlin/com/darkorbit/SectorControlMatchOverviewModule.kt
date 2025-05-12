package com.darkorbit

interface SectorControlMatchOverviewModule : ProtocolPacket {
	var matchId: Int
	var matchState: SectorControlMatchOverviewModuleMatchState
	var maxPlayerPerFaction: Int
	var playersInQueue: Int
	var playersOfOwnFaction: Int
	var remainingTickets: Int
	var totalTickets: Int
}
