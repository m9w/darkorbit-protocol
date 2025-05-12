package com.darkorbit

interface MiniClientRewardDayInfoCommand : ProtocolPacket {
	var daysClaimed: Short
	var isClaimable: Boolean
}
