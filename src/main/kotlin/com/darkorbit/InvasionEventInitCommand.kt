package com.darkorbit

interface InvasionEventInitCommand : ProtocolPacket {
	var score_EIC: Long
	var score_MMO: Long
	var score_VRU: Long
	var waveCount: Int
}
