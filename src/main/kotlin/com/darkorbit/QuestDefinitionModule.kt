package com.darkorbit

interface QuestDefinitionModule : ProtocolPacket {
	var icons: MutableList<QuestIconModule>
	var id: Int
	var portraitId: String
	var rewards: MutableList<LootModule>
	var rootCase: QuestCaseModule
	var textKeyFoundation: String
	var types: MutableList<QuestTypeModule>
}
