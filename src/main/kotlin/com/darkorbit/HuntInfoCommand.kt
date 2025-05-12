package com.darkorbit

interface HuntInfoCommand : ProtocolPacket {
	var clanRanges: MutableList<RankRewardRangeModule>
	var filename: String
	var playerPoints: Int
	var playerRanges: MutableList<RankRewardRangeModule>
	var timeLeft: Long
	var totalClanPoints: Int
}
