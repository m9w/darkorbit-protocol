package com.darkorbit

interface MapEventSetShipAttackableCommand : ProtocolPacket {
	var isAttackable: Boolean
	var userId: Int
}
