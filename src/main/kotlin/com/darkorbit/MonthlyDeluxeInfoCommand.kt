package com.darkorbit

interface MonthlyDeluxeInfoCommand : ProtocolPacket {
	var dayInfoCommand: MonthlyDeluxeDayInfoCommand
	var rewardList: MutableList<MonthlyDeluxeRewardModule>
	var timeInfoCommand: MonthlyDeluxeTimeInfoCommand
}
