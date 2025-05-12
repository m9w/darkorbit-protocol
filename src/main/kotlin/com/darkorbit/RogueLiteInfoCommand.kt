package com.darkorbit

interface RogueLiteInfoCommand : ProtocolPacket {
	var cashoutInfo: RogueLiteCashOutCommand
	var cpuInfo: RogueLiteCpuInfoCommand
	var highscore: Int
	var isAtGate: Boolean
	var progress: Int
	var score: Int
	var shipId: Int
}
