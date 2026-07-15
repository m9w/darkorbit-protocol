package com.darkorbit

interface VoyagersClaimPassRewardRequest : ProtocolPacket {
	var isVip: Boolean
	var rewardLevel: Int
}
