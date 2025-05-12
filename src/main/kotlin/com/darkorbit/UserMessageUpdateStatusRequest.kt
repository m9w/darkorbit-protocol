package com.darkorbit

interface UserMessageUpdateStatusRequest : ProtocolPacket {
	var ids: MutableList<Long>
	var inbox: Boolean
	var status: Int
}
