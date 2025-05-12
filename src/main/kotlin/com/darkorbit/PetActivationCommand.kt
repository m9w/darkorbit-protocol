package com.darkorbit

interface PetActivationCommand : ProtocolPacket {
	var clanRelationship: ClanRelationModule
	var clanTag: String
	var expansionStage: Short
	var isInIdleMode: Boolean
	var isVisible: Boolean
	var minimapStrategyModule: MinimapStrategyModule
	var ownerId: Int
	var petClanID: Int
	var petDesignId: Short
	var petFactionId: Short
	var petId: Int
	var petLevel: Short
	var petName: String
	var petSpeed: Int
	var x: Int
	var y: Int
}
