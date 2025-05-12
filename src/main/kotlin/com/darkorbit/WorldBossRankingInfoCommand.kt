package com.darkorbit

interface WorldBossRankingInfoCommand : ProtocolPacket {
	var isActive: Boolean
	var myRank: WorldBossRankingInfoModule
	var nextRank: WorldBossRankingInfoModule
	var prevRank: WorldBossRankingInfoModule
	var rankingInfoList: MutableList<WorldBossRankingInfoModule>
}
