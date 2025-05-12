package com.darkorbit

interface LogMessageCommand : ProtocolPacket {
	var message: MessageLocalizedWildcardCommand
	var style: Style
	var visibility: Visibility
}
