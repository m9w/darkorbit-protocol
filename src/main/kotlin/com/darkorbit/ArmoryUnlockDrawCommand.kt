package com.darkorbit

interface ArmoryUnlockDrawCommand : ProtocolPacket {
	var count: Int
	var rewardModuleList: MutableList<RewardModule>
	var type: Int
}
