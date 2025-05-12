package com.darkorbit

interface AmmunitionFallbackCommand : ProtocolPacket {
	var ammunitionType: AmmunitionFallbackCommandAmmunitionType
	var typeIdNew: Int
	var typeIdOld: Int
}
