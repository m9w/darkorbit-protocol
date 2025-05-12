package com.darkorbit

interface WorldBossRewardsTierUpdateCommand : ProtocolPacket {
	var currentTier: Int
}
