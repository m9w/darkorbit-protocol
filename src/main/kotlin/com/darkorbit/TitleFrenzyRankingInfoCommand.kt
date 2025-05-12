package com.darkorbit

interface TitleFrenzyRankingInfoCommand : ProtocolPacket {
	var isActive: Boolean
	var myRank: TitleFrenzyRankingInfoModule
	var nextRank: TitleFrenzyRankingInfoModule
	var prevRank: TitleFrenzyRankingInfoModule
	var rankingInfoList: MutableList<TitleFrenzyRankingInfoModule>
}
