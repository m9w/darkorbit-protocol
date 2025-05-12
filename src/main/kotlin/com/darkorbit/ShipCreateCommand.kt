package com.darkorbit

interface ShipCreateCommand : ProtocolPacket {
	var clanDiplomacy: ClanRelationModule
	var clanId: Int
	var clanTag: String
	var cloaked: Boolean
	var dailyRank: Int
	var designSet: String
	var expansionStage: Int
	var factionId: Int
	var galaxyGatesDone: Int
	var minimapStrategyModule: MinimapStrategyModule
	var modifier: MutableList<VisualModifierCommand>
	var motherShipId: Int
	var npc: Boolean
	var positionIndex: Int
	var specialNpcType: String
	var typeId: String
	var useSystemFont: Boolean
	var userId: Int
	var userName: String
	var warnBox: Boolean
	var x: Int
	var y: Int
}
