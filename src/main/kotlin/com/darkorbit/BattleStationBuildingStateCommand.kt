package com.darkorbit

interface BattleStationBuildingStateCommand : ProtocolPacket {
	var affiliatedFaction: FactionModule
	var battleStationId: Int
	var battleStationName: String
	var mapAssetId: Int
	var ownerClan: String
	var secondsLeft: Int
	var totalSeconds: Int
}
