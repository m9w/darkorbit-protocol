package com.darkorbit

interface SectorControlMatchOverviewCommand : ProtocolPacket {
	var maxLevel: Int
	var minLevel: Int
	var minPlayersPerTeam: Int
	var overviewModules: MutableList<SectorControlMatchOverviewModule>
	var queuedForMatch: Int
}
