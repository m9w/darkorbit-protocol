package com.darkorbit

interface RecallBattlePassMissionRefreshInfo : ProtocolPacket {
	var dailyCount: Int
	var dailyLeft: Int
	var dailySequence: Int
	var nextDailyUridium: Int
	var nextWeeklyUridium: Int
	var weeklyCount: Int
	var weeklyLeft: Int
	var weeklySequence: Int
}
