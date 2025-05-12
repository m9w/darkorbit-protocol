package com.darkorbit

interface SectorControlCaptureParticipationCommand : ProtocolPacket {
	var capturing: Boolean
	var sectorId: String
}
