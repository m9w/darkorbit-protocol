package com.darkorbit

interface LMCollectAmmunitionCommand : ProtocolPacket {
	var collectedAmmunitionType: AmmunitionTypeModule
	var collectedAmount: Int
	var priorityMode: LogMessengerPriorityModule
}
