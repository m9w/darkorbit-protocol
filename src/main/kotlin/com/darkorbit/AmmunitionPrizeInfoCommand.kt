package com.darkorbit

interface AmmunitionPrizeInfoCommand : ProtocolPacket {
	var ammunitionPrizeItemList: MutableList<AmmunitionPrizeItem>
}
