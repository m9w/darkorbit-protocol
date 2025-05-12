package com.darkorbit

interface HangarShipMoveItemsRequest : ProtocolPacket {
	var configId: Int
	var destination: String
	var droneId: Int
	var hangarId: Int
	var index: Int
	var items: MutableList<Long>
	var slotSet: String
	var source: String
}
