package com.darkorbit

interface EternalBlacklightRankingEventInfoCommand : ProtocolPacket {
	var isEventEnabled: Boolean
	var playerRankRanges: MutableList<RankRewardRangeModule>
	var rankInfoCommand: EternalBlacklightRankInfoCommand
}
