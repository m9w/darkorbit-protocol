package com.darkorbit

interface WarGameInitLobbyCommand : ProtocolPacket {
	var lobbyStatus: WarGameLobbyStatusModule
	var rewards: MutableList<RewardContentModule>
}
