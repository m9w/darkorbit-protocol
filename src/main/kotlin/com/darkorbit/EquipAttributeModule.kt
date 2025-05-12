package com.darkorbit

interface EquipAttributeModule : ProtocolPacket {
	var AttributeID: String
	var AttributeValue: Int
	var maxAttributeValue: Int
	var upMax: Int
	var upMin: Int
}
