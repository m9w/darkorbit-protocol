package com.darkorbit

interface CommandCenterNewsInfoRequest : ProtocolPacket {
	var newsInfo: MutableList<CommandCenterNewsClickedRequest>
}
