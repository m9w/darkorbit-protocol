package com.darkorbit

interface HellstormAttackCommand : ProtocolPacket {
	var attackerId: Int
	var currentLoad: Int
	var hit: Boolean
	var rocketType: AmmunitionTypeModule
	var targetId: Int
}
