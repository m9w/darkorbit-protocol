package com.darkorbit

interface MenuItemCooldownGroupTimerCommand : ProtocolPacket {
	var cooldownType: CooldownTypeModule
	var maxTime: Long
	var time: Long
	var timerState: TimerStateModule
}
