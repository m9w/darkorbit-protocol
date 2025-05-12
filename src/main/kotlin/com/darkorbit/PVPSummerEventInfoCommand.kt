package com.darkorbit

interface PVPSummerEventInfoCommand : ProtocolPacket {
	var perKillRanges: MutableList<RankRewardRangeModule>
	var reputationRanges: MutableList<RankRewardRangeModule>
	var reputationUpdateCommand: PVPSummerEventSelfReputationUpdateCommand
	var shuffleInfoCommand: PVPSummerEventShuffleInfoCommand
	var timeToEndFever: Long
	var timeToNextFever: Long
}
