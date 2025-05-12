package com.darkorbit

interface GalaxyGateBuilderPartItemModule : GalaxyGateBuilderItemModule {
	var current: Short
	var duplicate: Boolean
	var gate_id: Byte
	var lifePrice: Int
	var livesLeft: Int
	var multiplier_used: Byte
	var part_id: Short
	var state: GalaxyGateBuilderPartItemModuleGateState
}
