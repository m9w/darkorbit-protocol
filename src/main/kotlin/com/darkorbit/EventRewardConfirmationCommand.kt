package com.darkorbit

interface EventRewardConfirmationCommand : ProtocolPacket {
	var ranking: Int
	var reward: MutableList<RewardContentModule>
	var rewardType: EventRewardConfirmationCommandRewardType
}
