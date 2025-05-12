package com.darkorbit

interface EternalGateRankModule : ProtocolPacket {
	var lastUpdateTime: String
	var name: String
	var rank: Int
	var waves: Int
}
