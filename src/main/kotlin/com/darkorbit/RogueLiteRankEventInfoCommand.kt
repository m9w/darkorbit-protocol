package com.darkorbit

interface RogueLiteRankEventInfoCommand : ProtocolPacket {
	var isEventEnabled: Boolean
	var playerRankRanges: MutableList<RankRewardRangeModule>
	var rankInfoCommand: RogueLiteRankInfoCommand
}
