package com.darkorbit

interface EternalGateRankInfoCommand : ProtocolPacket {
	var myRank: EternalGateRankModule
	var topRankers: MutableList<EternalGateRankModule>
}
