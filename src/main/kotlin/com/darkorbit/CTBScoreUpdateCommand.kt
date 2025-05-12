package com.darkorbit

interface CTBScoreUpdateCommand : ProtocolPacket {
	var score_EIC: Int
	var score_MMO: Int
	var score_VRU: Int
}
