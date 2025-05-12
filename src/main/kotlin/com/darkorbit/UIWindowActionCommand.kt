package com.darkorbit

interface UIWindowActionCommand : ProtocolPacket {
	var windowActions: MutableList<UIWindowActionModule>
}
