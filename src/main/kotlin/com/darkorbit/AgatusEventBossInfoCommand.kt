package com.darkorbit

interface AgatusEventBossInfoCommand : ProtocolPacket {
	var bossCount: Int
	var leftToKill: Int
}
