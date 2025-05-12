package com.darkorbit

interface SectorControlBonusCommand : ProtocolPacket {
	var bonusFactor: Float
	var bonusType: BoostedAttributeTypeModule
	var faction: FactionModule
}
