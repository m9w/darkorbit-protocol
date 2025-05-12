package com.darkorbit

interface RewardContentCommand : ProtocolPacket {
	var rewardContentModuleList: MutableList<RewardContentModule>
	var rewardType: RewardContentCommandRewardType
}
