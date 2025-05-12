package com.darkorbit

interface CCommandModule : ProtocolPacket {
	var args: MutableList<CCAttributeModule>
	var name: String
	var singleAttributeSelection: Boolean
	var toolTip: String
}
