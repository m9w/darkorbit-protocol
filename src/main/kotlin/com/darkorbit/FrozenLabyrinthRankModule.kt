package com.darkorbit

interface FrozenLabyrinthRankModule : ProtocolPacket {
	var kills: Int
	var lastKillTime: String
	var name: String
	var rank: Int
}
