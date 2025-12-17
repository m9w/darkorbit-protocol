package com.darkorbit

interface Birthday2025GateWindowCommand : ProtocolPacket {
	var commandList: MutableList<Birthday2025GateRewardCommand>
	var curLevel: Int
	var curLootAmount: Int
}
