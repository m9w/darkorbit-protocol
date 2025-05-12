package com.darkorbit

interface PlayVisualEffectCommand : ProtocolPacket {
	var activatorId: Int
	var targetIds: MutableList<Int>
	var visualEffect: String
}
