package com.darkorbit

interface SectorControlMatchDetailCommand : ProtocolPacket {
	var matchId: Int
	var playerCounts: MutableList<SectorControlPlayerCountModule>
	var runningTimeInSecs: Int
	var ticketCounts: MutableList<SectorControlTicketCountCommand>
}
