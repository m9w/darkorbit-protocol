package com.darkorbit

interface GalaxyGateBuilderGateModule : ProtocolPacket {
	var bonusGGRewardModules: MutableList<GalaxyGateBuilderBonusGGRewardModule>
	var boosts: MutableList<GalaxyGateBuilderItemModule>
	var currPart: Short
	var currWave: Short
	var id: Byte
	var lifePrice: Int
	var livesLeft: Int
	var mode: String
	var multiGateProgressModules: MutableList<GalaxyGateBuilderMultiGateProgressModule>
	var multiplier: Byte
	var probabilityModules: MutableList<GalaxyGateBuilderProbabilityModule>
	var state: GalaxyGateBuilderGateModuleGateState
}
