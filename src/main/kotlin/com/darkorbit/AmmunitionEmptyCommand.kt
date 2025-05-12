package com.darkorbit

interface AmmunitionEmptyCommand : ProtocolPacket {
	var alternativeAvailable: Boolean
	var ammunitionType: AmmunitionEmptyCommandAmmunitionType
}
