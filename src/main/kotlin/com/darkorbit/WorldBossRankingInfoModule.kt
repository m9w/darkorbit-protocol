package com.darkorbit

interface WorldBossRankingInfoModule : ProtocolPacket {
	var rank: Int
	var score: Int
	var timeTaken: Long
	var username: String
}
