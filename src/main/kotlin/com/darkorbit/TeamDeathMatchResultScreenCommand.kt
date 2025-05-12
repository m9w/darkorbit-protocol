package com.darkorbit

interface TeamDeathMatchResultScreenCommand : ProtocolPacket {
	var hint: HintModule
	var opponentFaction: FactionModule
	var opponentPlayers: MutableList<TeamDeathMatchResultScreenPlayerModule>
	var ownFaction: FactionModule
	var ownPlayers: MutableList<TeamDeathMatchResultScreenPlayerModule>
	var playerSessionDeaths: Int
	var playerSessionKills: Int
	var resultState: ResultState
	var rewards: MutableList<RewardModule>
}
