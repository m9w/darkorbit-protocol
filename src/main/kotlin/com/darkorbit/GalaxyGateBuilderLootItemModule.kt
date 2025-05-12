package com.darkorbit

interface GalaxyGateBuilderLootItemModule : GalaxyGateBuilderItemModule {
	var amount: Int
	var item_id: Byte
	var multiplier_amount: Int
	var multiplier_used: Short
	var spins: Byte
}
