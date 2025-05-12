package com.darkorbit

interface ExpeditionBuyTicketCommand : ProtocolPacket {
	var result: Boolean
	var stack: BaseStackCommand
}
