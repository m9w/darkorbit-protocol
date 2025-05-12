package com.darkorbit

interface RefreshQuestInfo : ProtocolPacket {
	var dailyCount: Int
	var dailyLeft: Int
	var nextDailyUridium: Int
	var nextWeeklyUridium: Int
	var weeklyCount: Int
	var weeklyLeft: Int
}
