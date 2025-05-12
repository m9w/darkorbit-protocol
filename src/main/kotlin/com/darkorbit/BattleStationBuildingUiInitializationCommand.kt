package com.darkorbit

interface BattleStationBuildingUiInitializationCommand : ProtocolPacket {
	var availableModules: AvailableModulesCommand
	var battleStationId: Int
	var battleStationName: String
	var buildTimeInMinutesIncrement: Int
	var buildTimeInMinutesMax: Int
	var buildTimeInMinutesMin: Int
	var mapAssetId: Int
	var progress: AsteroidProgressCommand
}
