package com.darkorbit

interface PetLevelUpdateCommand : ProtocolPacket {
	var designId: Short
	var expansionStage: Short
	var petExperiencePointsUntilNextLevel: Long
	var petLevel: Short
}
