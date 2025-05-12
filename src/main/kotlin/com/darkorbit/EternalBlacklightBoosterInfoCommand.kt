package com.darkorbit

interface EternalBlacklightBoosterInfoCommand : ProtocolPacket {
	var currentBooster: MutableList<EternalBlacklightBoosterCommand>
	var option1: EternalBlacklightBoosterCommand
	var option2: EternalBlacklightBoosterCommand
	var option3: EternalBlacklightBoosterCommand
	var skillPointInfo: EternalBlacklightSkillPointInfoCommand
}
