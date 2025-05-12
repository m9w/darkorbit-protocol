package com.darkorbit

interface EternalBlacklightRankModule : ProtocolPacket {
	var lastUpdateTime: String
	var name: String
	var rank: Int
	var waves: Int
}
