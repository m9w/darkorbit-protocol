package com.darkorbit

interface AmmunitionBuyRequest : ProtocolPacket {
	var ammunitionType: AmmunitionTypeModule
	var amount: Int
}
