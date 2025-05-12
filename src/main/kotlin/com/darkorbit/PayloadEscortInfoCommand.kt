package com.darkorbit

interface PayloadEscortInfoCommand : ProtocolPacket {
	var isInSession: Boolean
	var keyInfoCommand: PayloadEscortKeyInfoCommand
	var playerRankRanges: MutableList<RankRewardRangeModule>
	var timeInfoCommand: PayloadEscortTimeInfoCommand
	var totalScore: Int
}
