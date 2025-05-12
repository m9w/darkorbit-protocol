package com.darkorbit

interface InternalPilotBioUpdateResultsCommand : ProtocolPacket {
	var baseStackCommand: BaseStackCommand
	var success: Boolean
}
