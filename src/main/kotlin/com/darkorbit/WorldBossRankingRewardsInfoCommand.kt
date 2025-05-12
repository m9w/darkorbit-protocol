package com.darkorbit

interface WorldBossRankingRewardsInfoCommand : ProtocolPacket {
	var dailyRankRewards: MutableList<RankRewardRangeModule>
	var rankRewards: MutableList<RankRewardRangeModule>
}
