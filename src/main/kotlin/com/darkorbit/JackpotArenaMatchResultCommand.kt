package com.darkorbit

interface JackpotArenaMatchResultCommand : ProtocolPacket {
	var hint: MessageLocalizedCommand
	var isWinner: Boolean
	var loserData: JackpotArenaMatchResultModule
	var winnerData: JackpotArenaMatchResultModule
}
