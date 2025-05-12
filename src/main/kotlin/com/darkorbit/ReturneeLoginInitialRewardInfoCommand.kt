package com.darkorbit

interface ReturneeLoginInitialRewardInfoCommand : ProtocolPacket {
	var isClaimable: Boolean
	var rewardList: MutableList<ReturneeLoginItemRewardModule>
}
