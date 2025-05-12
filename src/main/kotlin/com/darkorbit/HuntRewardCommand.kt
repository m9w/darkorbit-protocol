package com.darkorbit

interface HuntRewardCommand : ProtocolPacket {
	var huntReward: MutableList<RewardContentModule>
	var rewardRange: RankRewardRangeModule
	var rewardType: HuntRewardCommandRewardType
}
