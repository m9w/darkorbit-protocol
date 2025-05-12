package com.darkorbit

interface ExpeditionRankUserInfoCommand : ProtocolPacket {
	var clearanceTime: Int
	var curLevel: Int
	var rank: Int
	var userId: Int
	var userName: String
}
