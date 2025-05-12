package com.darkorbit

interface PetStatusCommand : ProtocolPacket {
	var petCurrentFuel: Int
	var petExperiencePoints: Long
	var petExperiencePointsUntilNextLevel: Long
	var petHitPoints: Int
	var petHitPointsMax: Int
	var petId: Int
	var petLevel: Int
	var petLootId: String
	var petMaxFuel: Int
	var petName: String
	var petShieldEnergyMax: Int
	var petShieldEnergyNow: Int
	var petSpeed: Int
}
