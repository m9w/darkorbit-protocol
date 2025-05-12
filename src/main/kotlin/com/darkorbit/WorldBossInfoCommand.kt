package com.darkorbit

interface WorldBossInfoCommand : ProtocolPacket {
	var bannerKey: String
	var currAttempts: Int
	var currHealth: Long
	var currTier: Int
	var descriptionKey: String
	var maxAttempts: Int
	var maxHealth: Long
	var sloganKey: String
	var timeToEventEnd: Long
	var worldBossName: String
}
