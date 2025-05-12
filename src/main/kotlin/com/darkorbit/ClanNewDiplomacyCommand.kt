package com.darkorbit

interface ClanNewDiplomacyCommand : ProtocolPacket {
	var clanDiploReqInfoCommand: ClanDiploReqInfoCommand
	var errorMsg: BaseStackCommand
	var success: Boolean
}
