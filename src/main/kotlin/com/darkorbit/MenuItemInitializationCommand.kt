package com.darkorbit

interface MenuItemInitializationCommand : ProtocolPacket {
	var actionStyle: ActionStyle
	var cooldownGroup: CooldownTypeModule
	var counterType: CounterType
	var defaultIndex: Int
	var showTooltipCooldownTimer: Boolean
	var status: MenuItemStatusCommand
	var timer: MenuItemTimerCommand
}
