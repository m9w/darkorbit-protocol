package com.darkorbit

interface ClanTaxInfoCommand : ProtocolPacket {
	var income: Int
	var logList: MutableList<ClanTaxLogCommand>
}
