package com.darkorbit

interface HealCommand : ProtocolPacket {
	var currentHitpoints: Int
	var healAmount: Int
	var healType: HealType
	var healedId: Int
	var healerId: Int
}
