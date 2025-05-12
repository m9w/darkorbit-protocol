package com.darkorbit

interface GalaxyGateBuilderInfoCommand : ProtocolPacket {
	var bonusRewardsDay: Boolean
	var energy_cost: Short
	var galaxyGateDay: Boolean
	var gates: MutableList<GalaxyGateBuilderGateModule>
	var money: Long
	var samples: Long
	var spinAmounts: MutableList<Byte>
	var spinOnSale: Boolean
	var spinamount_selected: Byte
}
