package com.darkorbit

interface QuestSlimInfoModule : ProtocolPacket {
	var acceptabilityStatus: QuestAcceptabilityStatusModule
	var icon: QuestIconModule
	var minLevel: Int
	var missingAcceptRequirements: MutableList<QuestRequirementModule>
	var portraitId: String
	var priority: Int
	var questId: Int
	var rootCaseId: Int
	var star: Int
	var textKeyFoundation: String
	var types: MutableList<QuestTypeModule>
}
