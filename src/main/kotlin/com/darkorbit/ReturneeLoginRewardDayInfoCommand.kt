package com.darkorbit

interface ReturneeLoginRewardDayInfoCommand : ProtocolPacket {
	var daysClaimed: Short
	var isClaimable: Boolean
}
