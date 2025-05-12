package com.darkorbit

interface AttackRocketRequest : ProtocolPacket {
	var targetId: Int
	var targetX: Int
	var targetY: Int
}
