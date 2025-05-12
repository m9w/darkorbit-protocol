package com.darkorbit

interface UserMessageDeleteRequest : ProtocolPacket {
	var deleteIds: MutableList<Long>
	var inbox: Boolean
}
