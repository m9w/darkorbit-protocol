package com.darkorbit

interface EternalGateBoosterInfoCommand : ProtocolPacket {
	var currentBooster: MutableList<EternalGateBoosterCommand>
	var option1: EternalGateBoosterCommand
	var option2: EternalGateBoosterCommand
	var option3: EternalGateBoosterCommand
	var skillPointInfo: EternalGateSkillPointInfoCommand
}
