package com.darkorbit

interface TieredArenaEventInfoCommand : ProtocolPacket {
	var reputationRanges: MutableList<RankRewardRangeModule>
	var reputationUpdateCommand: TieredArenaEventSelfReputationUpdateCommand
	var tieredUpdateCommand: TieredArenaEventTierUpdateCommand
	var timeToArenaClose: Long
	var timeToEventEnd: Long
	var timeToNextArenaOpen: Long
}
