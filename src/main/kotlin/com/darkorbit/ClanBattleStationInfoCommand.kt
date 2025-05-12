package com.darkorbit

interface ClanBattleStationInfoCommand : ProtocolPacket {
	var allStations: Int
	var battleStationOverviewInfoCommands: MutableList<BattleStationOverviewInfoCommand>
	var destroyedStations: Int
	var maxStationAtOnce: Int
	var stationOwnedLongestTime: String
	var stations: Int
}
