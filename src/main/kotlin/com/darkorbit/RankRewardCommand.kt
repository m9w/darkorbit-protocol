package com.darkorbit

interface RankRewardCommand : ProtocolPacket {
	var rankType: RankRewardCommandRankType
	var rewardContentModuleList: MutableList<RewardContentModule>
	var rewardRange: RankRewardRangeModule
}
