package com.darkorbit

interface AttackRangeExceededCommand : ProtocolPacket {
	var maxRange: Int
	var type: AttackRangeExceededCommandAttackType
	var uid: Int
}
