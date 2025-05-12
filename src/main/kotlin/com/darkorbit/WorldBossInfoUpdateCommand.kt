package com.darkorbit

interface WorldBossInfoUpdateCommand : ProtocolPacket {
	var currHealth: Long
	var currTier: Int
	var maxHealth: Long
}
