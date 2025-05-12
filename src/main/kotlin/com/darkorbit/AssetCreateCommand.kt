package com.darkorbit

interface AssetCreateCommand : ProtocolPacket {
	var assetId: Int
	var clanId: Int
	var clanRelation: ClanRelationModule
	var clanTag: String
	var designId: Int
	var detectedByWarnRadar: Boolean
	var expansionStage: Int
	var factionId: Int
	var invisible: Boolean
	var modifier: MutableList<VisualModifierCommand>
	var posX: Int
	var posY: Int
	var showBubble: Boolean
	var type: AssetTypeModule
	var userName: String
	var visibleOnWarnRadar: Boolean
}
