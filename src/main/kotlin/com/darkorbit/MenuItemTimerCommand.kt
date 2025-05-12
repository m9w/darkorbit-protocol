package com.darkorbit

interface MenuItemTimerCommand : ProtocolPacket {
	var activatable: Boolean
	var maxTime: Long
	var menuItemId: String
	var time: Long
	var timerState: TimerStateModule
}
