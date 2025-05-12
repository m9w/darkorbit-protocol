package com.darkorbit

interface ChatAuthenticateUserRequest : ProtocolPacket {
	var endpointId: String
	var language: String
}
