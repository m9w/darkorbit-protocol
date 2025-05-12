package com.darkorbit

interface SeasonPassMissionModule : ProtocolPacket {
	var missionStatus: SeasonPassMissionStatusModule
	var questDefinitionModule: QuestDefinitionModule
}
