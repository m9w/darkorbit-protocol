package com.darkorbit

interface RankModule : ProtocolPacket {
	var lastUpdateTime: Long
	var name: String
	var points: Int
	var rank: Int
}
