package com.darkorbit

interface MenuActionRequest : ProtocolPacket {
	var actionType: MenuActionRequestActionType
	var menuItemId: String
	var sourceType: SourceType
}
