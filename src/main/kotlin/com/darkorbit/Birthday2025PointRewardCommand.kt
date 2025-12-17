package com.darkorbit

interface Birthday2025PointRewardCommand : ProtocolPacket {
	var claimedIndexes: MutableList<Int>
	var curLevelPoints: Int
	var curPoints: Int
	var curRewardLevel: Int
	var lootShowCommandList: MutableList<EventLootShowCommand>
	var openWindow: Boolean
}
