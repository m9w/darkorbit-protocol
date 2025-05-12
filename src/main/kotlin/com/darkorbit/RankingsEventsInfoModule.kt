package com.darkorbit

interface RankingsEventsInfoModule : ProtocolPacket {
	var rank: Int
	var rankInfo: MutableList<String>
}
