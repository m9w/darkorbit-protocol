package com.darkorbit

interface CCRequestAttributeModule : ProtocolPacket {
	var name: String
	var subAttributes: MutableList<CCRequestAttributeModule>
	var value: CCValueModule
}
