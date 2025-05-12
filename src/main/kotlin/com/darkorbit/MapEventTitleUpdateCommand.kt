package com.darkorbit

interface MapEventTitleUpdateCommand : ProtocolPacket {
	var titleAction: MapEventTitleUpdateCommandAction
	var titleKey: String
	var type: TitleType
	var userId: Int
}
