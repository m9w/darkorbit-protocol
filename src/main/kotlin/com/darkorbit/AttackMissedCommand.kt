package com.darkorbit

interface AttackMissedCommand : ProtocolPacket {
	var attackType: AttackTypeModule
	var skillColorId: Int
	var targetUserId: Int
}
