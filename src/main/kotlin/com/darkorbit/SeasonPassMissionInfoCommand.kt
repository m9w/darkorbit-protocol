package com.darkorbit

interface SeasonPassMissionInfoCommand : ProtocolPacket {
	var missionInfoType: MissionInfoType
	var missionItems: MutableList<SeasonPassMissionModule>
	var refreshInfo: RefreshQuestInfo
}
