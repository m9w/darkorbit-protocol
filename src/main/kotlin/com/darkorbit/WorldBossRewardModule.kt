package com.darkorbit

interface WorldBossRewardModule : ProtocolPacket {
	var rewards: MutableList<WorldBossCompletionModule>
}
