package com.darkorbit

interface TrainingArenaRankInfoCommand : ProtocolPacket {
	var battles: Int
	var points: Float
	var rank: Int
	var victories: Int
}
