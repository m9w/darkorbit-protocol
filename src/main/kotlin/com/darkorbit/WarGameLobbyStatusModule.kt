package com.darkorbit

interface WarGameLobbyStatusModule : ProtocolPacket {
	var minPlayers: Int
	var playerCount: Int
	var status: WarGameLobbyStatusModuleStatus
}
