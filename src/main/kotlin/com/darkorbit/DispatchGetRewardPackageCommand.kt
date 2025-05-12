package com.darkorbit

interface DispatchGetRewardPackageCommand : ProtocolPacket {
	var name: String
	var rewards: MutableList<RewardContentModule>
}
