package com.darkorbit

interface ClanEditDiploOfferCommand : ProtocolPacket {
	var clanDiploInfoCommand: ClanDiploInfoCommand
	var clanDiploReqInfoCommand: ClanDiploReqInfoCommand
	var stack: BaseStackCommand
	var status: String
	var success: Boolean
}
