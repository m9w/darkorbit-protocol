package com.darkorbit

interface AmmunitionPrizeItem : ProtocolPacket {
	var ammunitionType: AmmunitionTypeModule
	var amount: Int
	var currencyType: AmmunitionPrizeItemCurrencyType
	var summedPrize: Int
}
