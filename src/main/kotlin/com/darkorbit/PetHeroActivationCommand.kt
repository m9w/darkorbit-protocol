package com.darkorbit

interface PetHeroActivationCommand : ProtocolPacket {
	var clanId: Int
	var clanTag: String
	var expansionStage: Short
	var factionId: Short
	var minimapStrategyModule: MinimapStrategyModule
	var ownerId: Int
	var petId: Int
	var petLevel: Short
	var petName: String
	var petSpeed: Int
	var shipType: Short
	var x: Int
	var y: Int
}
