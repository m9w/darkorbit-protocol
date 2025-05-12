package com.darkorbit

interface FoundClanRequest : ProtocolPacket {
	var clanDescription: String
	var clanName: String
	var clanTag: String
}
