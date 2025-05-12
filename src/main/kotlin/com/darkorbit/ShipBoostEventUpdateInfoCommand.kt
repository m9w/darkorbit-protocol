package com.darkorbit

interface ShipBoostEventUpdateInfoCommand : ProtocolPacket {
	var boostInfo: ShipBoostEventBoostInfoCommand
	var currentSlot: ShipBoostEventModule
	var isBoostActive: Boolean
	var timeToWindowChange: Long
}
