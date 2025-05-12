package com.darkorbit

interface TitleFrenzyInfoCommand : ProtocolPacket {
	var npcIds: MutableList<Int>
	var rankRewards: MutableList<RankRewardRangeModule>
	var schedule: TitleFrenzyScheduleUpdateCommand
	var timeToEventEnd: Long
	var titleKey: String
}
