package com.darkorbit

interface CannonAttackCommand : ProtocolPacket {
	var attackedId: Int
	var attackerId: Int
	var cannonType: CannonType
	var hit: Boolean
}
