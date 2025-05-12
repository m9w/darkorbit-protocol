package com.darkorbit

interface DailyLoginRewardDayCommand : ProtocolPacket {
	var claimed: Boolean
	var day: Int
	var end: Boolean
	var month: Int
	var nextMonthSeconds: Int
}
