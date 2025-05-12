package com.darkorbit

interface BattleStationHistoryInfoCommand : ProtocolPacket {
	var buildSeconds: Int
	var date: String
	var mapName: String
	var opponentClanName: String
	var stationId: Int
	var stationName: String
	var type: String
	var userName: String
	var values: String
}
