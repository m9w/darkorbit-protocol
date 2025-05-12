package com.darkorbit

interface ItemCommand : ProtocolPacket {
	var itemId: String
	var toolTip: MessageKeyListWildcardCommand
	var visible: Boolean
}
