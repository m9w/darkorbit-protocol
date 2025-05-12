package com.darkorbit

interface QuestRequirementModule : ProtocolPacket {
	var matches: MutableList<QuestLocalizationModule>
	var maxValue: Long
	var minValue: Long
	var missingMatches: MutableList<QuestLocalizationModule>
	var requirementType: QuestRequirementType
}
