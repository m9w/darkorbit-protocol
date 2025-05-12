package com.darkorbit

interface SectorControlErrorCommand : ProtocolPacket {
	var errorType: SectorControlErrorCommandErrorType
}
