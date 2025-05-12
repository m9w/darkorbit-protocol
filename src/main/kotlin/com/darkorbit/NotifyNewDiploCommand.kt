package com.darkorbit

interface NotifyNewDiploCommand : ProtocolPacket {
	var command: ClanDiploInfoCommand
}
