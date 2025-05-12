package com.darkorbit

interface AttackLaserRequest : ProtocolPacket {
	var targetId: Int
	var targetX: Int
	var targetY: Int
}
