package com.darkorbit

interface RankRewardRequest : ProtocolPacket {
	var rankType: RankRewardRequestRankType
	var ranking: Int
}
