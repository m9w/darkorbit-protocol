package com.darkorbit

interface HuntEventRankingPointsUpdateCommand : ProtocolPacket {
	var score: Int
	var updateMode: UpdateMode
}
