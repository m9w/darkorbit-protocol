package com.darkorbit

interface RankInfoCommand : ProtocolPacket {
	var myRank: RankModule
	var topRankers: MutableList<RankModule>
}
