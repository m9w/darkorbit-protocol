package com.darkorbit

interface AgatusEventInfoCommand : ProtocolPacket {
	var bossInfoCommand: AgatusEventBossInfoCommand
	var npcID: Int
	var textKey: String
	var timeInfoCommand: AgatusEventTimeInfoCommand
	var type: WindowType
}
