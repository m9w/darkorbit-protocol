package com.darkorbit

interface SeasonPassMissionInfoCommand : ProtocolPacket {
	var missionInfoType: SeasonPassMissionInfoCommandMissionInfoType
	var missionItems: MutableList<SeasonPassMissionModule>
	var refreshInfo: RefreshQuestInfo
}
