package com.darkorbit

interface HangarShipRepairModuleCommand : ProtocolPacket {
	var currentHitPoints: Int
	var errorMessage: BaseStackCommand
	var itemId: Long
	var maxHitPoints: Int
	var resultId: Int
}
