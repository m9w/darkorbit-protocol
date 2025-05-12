package com.darkorbit

interface SectorControlMatchStateInfoCommand : ProtocolPacket {
	var bonusInformation: MutableList<SectorControlBonusCommand>
	var playerCounts: MutableList<SectorControlPlayerCountModule>
	var ticketCounts: MutableList<SectorControlTicketCountCommand>
}
