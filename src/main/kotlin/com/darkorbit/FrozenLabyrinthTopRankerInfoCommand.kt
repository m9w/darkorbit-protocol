package com.darkorbit

interface FrozenLabyrinthTopRankerInfoCommand : ProtocolPacket {
	var topRankers: MutableList<FrozenLabyrinthRankModule>
}
