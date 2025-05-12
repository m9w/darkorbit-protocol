package com.darkorbit

interface CCommandRequest : ProtocolPacket {
	var attributes: MutableList<CCRequestAttributeModule>
	var name: String
}
