package com.darkorbit

interface TeamDeathMatchOverviewInitCommand : ProtocolPacket {
	var maxLevel: Int
	var minLevel: Int
	var overviewModules: MutableList<TeamDeathMatchOverviewModule>
	var queuedForMatch: Int
}
