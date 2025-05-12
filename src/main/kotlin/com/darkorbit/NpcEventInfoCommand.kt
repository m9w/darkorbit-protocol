package com.darkorbit

interface NpcEventInfoCommand : ProtocolPacket {
	var bossInfoCommand: NpcEventBossInfoCommand
	var npcID: Int
	var textKey: String
	var timeInfoCommand: NpcEventTimeInfoCommand
	var type: WindowType
}
