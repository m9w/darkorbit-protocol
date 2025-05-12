package com.darkorbit

interface ReturneeLoginRewardInfoCommand : ProtocolPacket {
	var daysClaimed: Short
	var isClaimable: Boolean
	var rewardList: MutableList<ReturneeLoginItemRewardModule>
	var timeToEndEvent: Long
}
