package com.darkorbit

interface EternalBlacklightRankInfoCommand : ProtocolPacket {
	var myRank: EternalBlacklightRankModule
	var topRankers: MutableList<EternalBlacklightRankModule>
}
