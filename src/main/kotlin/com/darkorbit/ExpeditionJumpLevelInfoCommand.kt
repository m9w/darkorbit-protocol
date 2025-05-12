package com.darkorbit

interface ExpeditionJumpLevelInfoCommand : ProtocolPacket {
	var costs: MutableList<Int>
	var levels: MutableList<Int>
}
