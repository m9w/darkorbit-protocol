package com.darkorbit

interface FrozenLabyrinthRankInfoCommand : ProtocolPacket {
	var myRank: FrozenLabyrinthRankModule
	var topRankers: MutableList<FrozenLabyrinthRankModule>
}
