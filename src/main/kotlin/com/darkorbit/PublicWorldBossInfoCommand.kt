package com.darkorbit

interface PublicWorldBossInfoCommand : ProtocolPacket {
	var currHealth: Long
	var currTier: Int
	var maxHealth: Long
	var publicWorldBossTierList: MutableList<PublicWorldBossTier>
	var raiding: Boolean
	var timeToEventEndSeconds: Long
	var timeToNextRaidSeconds: Long
}
