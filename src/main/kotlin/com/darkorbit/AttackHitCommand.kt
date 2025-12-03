package com.darkorbit

interface AttackHitCommand : ProtocolPacket {
	var attackType: AttackTypeModule
	var attackerId: Int
	var cannonType: CannonType
	var damage: Int
	var skilled: Boolean
	var strike: Boolean
	var victimHitpoints: Long
	var victimId: Int
	var victimNanoHull: Int
	var victimShield: Int
}
