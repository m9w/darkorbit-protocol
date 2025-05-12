package com.darkorbit

interface ShipBoostEventModule : ProtocolPacket {
	var attributeBoosts: MutableList<ShipBoostEventAttributeModule>
	var day: Byte
	var endTime: String
	var eventNameTextKeys: MutableList<String>
	var shipTypes: MutableList<String>
	var startTime: String
}
