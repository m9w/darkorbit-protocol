package com.darkorbit

interface TeamDeathMatchOverviewCommand : ProtocolPacket {
	var maxLevel: Int
	var minLevel: Int
	var overviewModules: MutableList<TeamDeathMatchOverviewModule>
	var queuedForMatch: Int
}
