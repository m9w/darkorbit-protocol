package com.darkorbit

interface ChangeClanLeaderRequest : ProtocolPacket {
	var newLeaderId: Int
}
