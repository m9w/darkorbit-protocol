package com.darkorbit

interface RecallBattlePassMissionInfoCommand : ProtocolPacket {
	var missionInfoType: RecallBattlePassMissionInfoCommandMissionInfoType
	var missionItems: MutableList<RecallBattlePassMissionModule>
	var refreshInfo: RecallBattlePassMissionRefreshInfo
	var requestId: Int
	var specialId: Int
}
