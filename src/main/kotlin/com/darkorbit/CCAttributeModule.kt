package com.darkorbit

interface CCAttributeModule : ProtocolPacket {
	var name: String
	var range: CCAbstractRangeModule
	var singleAttributeSelection: Boolean
	var subAttributes: MutableList<CCAttributeModule>
	var toolTip: String
}
