package com.darkorbit

interface VersionCommand : ProtocolPacket {
	var equal: Boolean
	var version: String
}
