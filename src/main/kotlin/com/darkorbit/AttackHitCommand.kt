package com.darkorbit

interface AttackHitCommand : ProtocolPacket {
	var attackType: AttackTypeModule
	var attackerId: Int
	var damage: Int
	var skilled: Boolean
	var strike: Boolean
	var victimHitpoints: Int
	var victimId: Int
	var victimNanoHull: Int
	var victimShield: Int
}
