package com.darkorbit

interface ApotheosisProgressCommand : ProtocolPacket {
	var bossLevel: Int
	var currentPoints: Int
	var hpPercent: Int
	var lastHitReward: ApotheosisRewardModule
	var nextResetTime: Long
	var participationReward: ApotheosisRewardModule
	var phase: Phase
	var remainingSeconds: Long
	var rewardStatusIncluded: Boolean
	var timeToEventEndSeconds: Long
	var totalPoints: Int
	var victoryReward: ApotheosisRewardModule
	var weeklyRanking: MutableList<ApotheosisRankingEntryModule>
}
