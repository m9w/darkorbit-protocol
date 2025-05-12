package com.darkorbit

interface LoginRequest : ProtocolPacket {
	var factionID: Short
	var instanceId: Int
	var isMiniClient: Boolean
	var sessionID: String
	var userID: Int
	var version: String
}
