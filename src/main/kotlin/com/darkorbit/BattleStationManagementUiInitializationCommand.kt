package com.darkorbit

interface BattleStationManagementUiInitializationCommand : ProtocolPacket {
	var availableModules: AvailableModulesCommand
	var battleStationId: Int
	var battleStationName: String
	var clanName: String
	var deflectorDeactivationPossible: Boolean
	var deflectorShieldMinutesIncrement: Int
	var deflectorShieldMinutesMax: Int
	var deflectorShieldMinutesMin: Int
	var faction: FactionModule
	var mapAssetId: Int
	var state: BattleStationStatusCommand
}
