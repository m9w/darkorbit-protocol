package com.darkorbit

interface WarGameTeamCountUpdateCommand : ProtocolPacket {
	var teamBlueMemersCount: Int
	var teamRedMemersCount: Int
}
