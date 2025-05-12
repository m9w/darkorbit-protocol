package com.darkorbit

interface AttackRocketCommand : ProtocolPacket {
	var attackerId: Int
	var hit: Boolean
	var isHeatSeeking: Boolean
	var rocketType: Int
	var smokeId: Int
	var targetId: Int
}
