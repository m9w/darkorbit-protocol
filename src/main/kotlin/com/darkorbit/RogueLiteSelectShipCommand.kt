package com.darkorbit

interface RogueLiteSelectShipCommand : ProtocolPacket {
	var modifierList: MutableList<RogueLiteModifierModule>
	var shipList: MutableList<RogueLiteShipModule>
}
