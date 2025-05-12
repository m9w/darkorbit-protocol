package com.darkorbit

interface SectorControlTicketCountCommand : ProtocolPacket {
	var faction: FactionModule
	var maxTickets: Int
	var ticketCount: Int
}
