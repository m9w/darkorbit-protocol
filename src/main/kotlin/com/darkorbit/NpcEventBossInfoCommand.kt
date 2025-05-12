package com.darkorbit

interface NpcEventBossInfoCommand : ProtocolPacket {
	var bossCount: Int
	var leftToKill: Int
}
