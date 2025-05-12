package com.darkorbit

interface PetExperiencePointsUpdateCommand : ProtocolPacket {
	var currentExperiencePoints: Long
	var maxExperiencePoints: Long
}
