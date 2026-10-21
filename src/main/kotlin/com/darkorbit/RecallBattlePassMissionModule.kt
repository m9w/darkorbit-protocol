package com.darkorbit

interface RecallBattlePassMissionModule : ProtocolPacket {
	var experience: Int
	var missionStatus: RecallBattlePassMissionStatusModule
	var nextReset: Long
	var period: Period
	var periodStart: Long
	var questDefinitionModule: QuestDefinitionModule
	var sourceQuestId: Int
}
