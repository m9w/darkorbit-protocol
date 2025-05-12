package com.darkorbit

interface NotifyNewDiploReqCommand : ProtocolPacket {
	var command: ClanDiploInfoCommand
}
