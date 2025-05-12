package com.darkorbit

interface KillScreenRepairRequest : ProtocolPacket {
	var requestModule: LoginRequest
	var selection: KillScreenOptionTypeModule
}
