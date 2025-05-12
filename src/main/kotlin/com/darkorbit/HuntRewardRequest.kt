package com.darkorbit

interface HuntRewardRequest : ProtocolPacket {
	var ranking: Int
	var rewardType: HuntRewardRequestRewardType
}
