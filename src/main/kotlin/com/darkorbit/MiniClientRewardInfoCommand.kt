package com.darkorbit

interface MiniClientRewardInfoCommand : ProtocolPacket {
	var daysClaimed: Short
	var isClaimable: Boolean
	var rewardList: MutableList<MiniClientItemRewardModule>
	var timeToEndEvent: Long
}
