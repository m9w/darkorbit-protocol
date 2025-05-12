package com.darkorbit

interface KillScreenPostCommand : ProtocolPacket {
	var cause: DestructionTypeModule
	var killerEpppLink: String
	var killerName: String
	var options: MutableList<KillScreenOptionModule>
	var playerShipAlias: String
}
