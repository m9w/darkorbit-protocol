package com.darkorbit

interface TrackVariableRequest : ProtocolPacket {
	var data: MutableList<TrackVariableModule>
}
