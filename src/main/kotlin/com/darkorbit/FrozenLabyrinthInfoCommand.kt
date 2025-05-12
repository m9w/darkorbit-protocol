package com.darkorbit

interface FrozenLabyrinthInfoCommand : ProtocolPacket {
	var labyrinthKeys: Int
	var rankInfo: FrozenLabyrinthRankInfoCommand
	var timeInfo: FrozenLabyrinthTimeInfoCommand
}
