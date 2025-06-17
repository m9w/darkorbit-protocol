package com.darkorbit

interface AttackHitNoLockCommand : ProtocolPacket {
	var attackType: AttackTypeModule
	var attackerId: Int
	var damage: Int
	var skilled: Boolean
	var strike: Boolean
	var victimHitpoints: Long
	var victimId: Int
	var victimMaxHitpoints: Long
	var victimMaxNanohull: Int
	var victimMaxShield: Int
	var victimNanoHull: Int
	var victimShield: Int
}
