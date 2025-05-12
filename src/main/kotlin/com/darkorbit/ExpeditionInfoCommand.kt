package com.darkorbit

interface ExpeditionInfoCommand : ProtocolPacket {
	var conditionNpcId: Int
	var curLevel: Int
	var eventEndTime: String
	var expeditionClearanceTimeCommand: ExpeditionClearanceTimeCommand
	var failureCondition: String
	var firstRewards: MutableList<ExpeditionRewardCommand>
	var keyCount: Int
	var maxLevel: Int
	var myRank: Int
	var normalRewards: MutableList<ExpeditionRewardCommand>
	var popup: Boolean
	var rankRewards: MutableList<RankRewardCommand>
	var ranks: MutableList<ExpeditionRankUserInfoCommand>
	var timeLimit: Int
	var victoryCondition: String
}
