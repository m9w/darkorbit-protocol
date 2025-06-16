package com.darkorbit

interface PublicWorldBossRankCommand : ProtocolPacket {
	var ranklist: MutableList<PublicWorldBossRankReward>
}
