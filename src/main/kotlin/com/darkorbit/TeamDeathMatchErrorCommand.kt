package com.darkorbit

interface TeamDeathMatchErrorCommand : ProtocolPacket {
	var errorType: TeamDeathMatchErrorCommandErrorType
}
